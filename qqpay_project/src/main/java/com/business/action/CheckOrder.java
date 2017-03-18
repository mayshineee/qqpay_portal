package com.business.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.pojo.vo.ActiveUser;
import com.business.pojo.po.CheckOrderResponse;
import com.business.pojo.po.CheckOrderResponseRs;
import com.business.service.impl.CheckOrderService;
import com.common.util.AsssempeldDate;
import com.common.util.CheckDateUtil;
import com.common.util.NumberUtil;

/**
 * 订单查询
 * 
 * @author zjx
 *
 */
@Controller
public class CheckOrder {

	@Autowired
	private CheckOrderService checkOrderService;

	private static final int pageSize = 10;
	private static final String RESULT = "result";
	private CheckOrderResponse checkOrderResponse;

	/**
	 * totalPage;//总页数 currentPage;//当前页数 pageSize;//页面放的记录数
	 * selectStartYear;//查询开始的年份 selectStartMonth;//查询开始的月份
	 * selectStartDay;//查询开始的日份 selectEndYear;//查询结束的年份 selectEndMonth;//查询结束的月份
	 * selectEndDay;//查询结束的日份 selectKind;//查询的种类
	 * totalPrice;//总金额
	 */
	@RequestMapping("/checkDefault")
	public String checkDefault(HttpServletRequest request, HttpServletResponse response) {

		// 检查用户是否已登录
		Object obj = request.getSession().getAttribute("activeuser");
		if (obj == null) {
			// 用户没有登录
			request.setAttribute(RESULT, "请登录后再进行查询!");
			return "/checkFail";
		}
		// 得到用户的用户名及用户id
		ActiveUser activeUser = (ActiveUser) obj;
		String userId = activeUser.getUserid();

		/**
		 * 校验前台传来的参数是否为null或"",若为null或""则返回-1; 并且检查其是否符合参数格式,若不符合参数格式则返回-2
		 */
		int currentPage = NumberUtil.parseInt(request.getParameter("currentPage"));
		int selectStartYear = NumberUtil.parseInt(request.getParameter("selectStartYear"));
		int selectStartMonth = NumberUtil.parseInt(request.getParameter("selectStartMonth"));
		int selectStartDay = NumberUtil.parseInt(request.getParameter("selectStartDay"));
		int selectEndYear = NumberUtil.parseInt(request.getParameter("selectEndYear"));
		int selectEndMonth = NumberUtil.parseInt(request.getParameter("selectEndMonth"));
		int selectEndDay = NumberUtil.parseInt(request.getParameter("selectEndDay"));
		int selectKind = NumberUtil.parseInt(request.getParameter("selectKind"));

		// 首次访问
		if (currentPage == -1 && selectStartYear == -1 && selectStartMonth == -1 && selectStartDay == -1
				&& selectEndYear == -1 && selectEndMonth == -1 && selectEndDay == -1 && selectKind == -1) {

			currentPage = 1;
			selectKind = 3;
			Date dat = new Date();
			selectStartYear = AsssempeldDate.getYear(dat);
			selectStartMonth = AsssempeldDate.getMonth(dat);
			selectStartDay = AsssempeldDate.getDay(dat);
			long selectEndTime = dat.getTime() + 86400000;
			Date dat1 = new Date(selectEndTime);
			selectEndYear = AsssempeldDate.getYear(dat1);
			selectEndMonth = AsssempeldDate.getMonth(dat1);
			selectEndDay = AsssempeldDate.getDay(dat1);
			checkOrderResponse = checkOrderService.findSubmitCondition(currentPage, selectKind, pageSize,
					selectStartYear, selectStartMonth, selectStartDay, selectEndYear, selectEndMonth, selectEndDay,
					userId);
			request.setAttribute("selectStartYear", selectStartYear);
			request.setAttribute("selectStartMonth", selectStartMonth);
			request.setAttribute("selectStartDay", selectStartDay);
			request.setAttribute("selectEndYear", selectEndYear);
			request.setAttribute("selectEndMonth", selectEndMonth);
			request.setAttribute("selectEndDay", selectEndDay);
			request.setAttribute("selectKind", selectKind);
			request.setAttribute("currentPage", currentPage);
			request.setAttribute("pageSize", pageSize);
			request.setAttribute("totalPrice", checkOrderResponse.getSumPrice());
			request.setAttribute("totalCount", checkOrderResponse.getTotalCount());
			request.setAttribute("totalPage", (checkOrderResponse.getTotalCount() + pageSize - 1) / pageSize);
			request.setAttribute("OrderList", checkOrderResponse.getResultList());
			return "/checkOrder";

			// 传来的参数格式不对
		} else if (currentPage == -2 || selectStartYear == -2 || selectStartMonth == -2 || selectStartDay == -2
				|| selectEndYear == -2 || selectEndMonth == -2 || selectEndDay == -2 || selectKind == -2) {

			request.setAttribute(RESULT, "参数格式不对,请确认参数是否填写正确");
			return "/checkFail";
			// 传来的参数格式正确
		} else if (selectStartYear != -1 && selectStartMonth != -1 && selectStartDay != -1 && selectEndYear != -1
				&& selectEndMonth != -1 && selectEndDay != -1 && selectKind > 0 && selectKind < 4) {
			// 判断传来的日期参数是否正确,若不正确则返回false;正确返回true
			boolean isNice = CheckDateUtil.checkDate(selectStartYear, selectStartMonth, selectStartDay, selectEndYear,
					selectEndMonth, selectEndDay);
			// 日期参数是不正确
			if (!isNice) {
				request.setAttribute(RESULT, "日期参数不对,请确认日期是否正确!");
				return "/checkFail";
			}
			// 日期参数是正确
			// 提交查询条件
			if (currentPage == -1) {
				currentPage = 1;
				checkOrderResponse = checkOrderService.findSubmitCondition(currentPage, selectKind, pageSize,
						selectStartYear, selectStartMonth, selectStartDay, selectEndYear, selectEndMonth, selectEndDay,
						userId);
				request.setAttribute("selectStartYear", selectStartYear);
				request.setAttribute("selectStartMonth", selectStartMonth);
				request.setAttribute("selectStartDay", selectStartDay);
				request.setAttribute("selectEndYear", selectEndYear);
				request.setAttribute("selectEndMonth", selectEndMonth);
				request.setAttribute("selectEndDay", selectEndDay);
				request.setAttribute("selectKind", selectKind);
				request.setAttribute("currentPage", currentPage);
				request.setAttribute("pageSize", pageSize);
				request.setAttribute("totalPrice", checkOrderResponse.getSumPrice());
				request.setAttribute("totalCount", checkOrderResponse.getTotalCount());
				request.setAttribute("totalPage", (checkOrderResponse.getTotalCount() + pageSize - 1) / pageSize);
				request.setAttribute("OrderList", checkOrderResponse.getResultList());
				return "/checkOrder";
				// 翻页
			} else {
				checkOrderResponse = checkOrderService.findPaging(currentPage, selectKind, pageSize, selectStartYear,
						selectStartMonth, selectStartDay, selectEndYear, selectEndMonth, selectEndDay, userId);
				request.setAttribute("selectStartYear", selectStartYear);
				request.setAttribute("selectStartMonth", selectStartMonth);
				request.setAttribute("selectStartDay", selectStartDay);
				request.setAttribute("selectEndYear", selectEndYear);
				request.setAttribute("selectEndMonth", selectEndMonth);
				request.setAttribute("selectEndDay", selectEndDay);
				request.setAttribute("selectKind", selectKind);
				request.setAttribute("currentPage", currentPage);
				request.setAttribute("pageSize", pageSize);
				request.setAttribute("totalPrice", checkOrderResponse.getSumPrice());
				request.setAttribute("totalCount", checkOrderResponse.getTotalCount());
				request.setAttribute("totalPage", (checkOrderResponse.getTotalCount() + pageSize - 1) / pageSize);
				request.setAttribute("OrderList", checkOrderResponse.getResultList());
				return "/checkOrder";
			}
			// 条件缺失
		} else {
			request.setAttribute(RESULT, "条件不足,请确认条件是否已全部填写正确!");
			return "/checkFail";
		}

	}
}
