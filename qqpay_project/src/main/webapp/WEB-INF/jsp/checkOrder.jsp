<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单查询</title>
<style type="text/css">
	*{
		font-size: 16px;
	}
	
	#checkTime{
		align:center;
		text-align:center;
	}
	
	#p1{
		position:absolute;
		right:50px;
		bottom: 45px;
	}
	
	form{
		margin:10px;
	}
	
	caption{
		font-size:28px;
		margin-bottom: 10px;
	}
	
	#dividepage{
		font-size:18px;
		position:absolute;
		left:33%;
		bottom:10px;
	}
	
	td,th{
		padding-left:10px;
		padding-bottom:5px;
		padding-right:10px;
		padding-top:5px;
		text-align:center;
	}
</style>

</head>
<body>
	<div id="checkTime">
		<form action="checkDefault.action" method="get" >
			从<input type="text" name="selectStartYear" id="selectStartYear" value="${selectStartYear }" style="width:40px; height:16px;"/>年
			<input type="text" name="selectStartMonth" id="selectStartMonth" value="${selectStartMonth }" style="width:20px; height:16px;"/>月
			<input type="text" name="selectStartDay" id="selectStartDay" value="${selectStartDay }" style="width:20px; height:16px;"/>日至
			<input type="text" name="selectEndYear" id="selectEndYear" value="${selectEndYear }" style="width:40px; height:16px;"/>年
			<input type="text" name="selectEndMonth" id="selectEndMonth" value="${selectEndMonth }" style="width:20px; height:16px;"/>月
			<input type="text" name="selectEndDay" id="selectEndDay" value="${selectEndDay }" style="width:20px;height:16px;"/>日<br/>
			<span>种类</span>
			<c:if test="${selectKind == 1 }">
				<input type="radio" name="selectKind" value="1" checked/>Q币
				<input type="radio" name="selectKind" value="2"/>羊城通
				<input type="radio" name="selectKind" value="3"/>所有
			</c:if>
			<c:if test="${selectKind == 2 }">
				<input type="radio" name="selectKind" value="1"/>Q币
				<input type="radio" name="selectKind" value="2" checked/>羊城通
				<input type="radio" name="selectKind" value="3"/>所有
			</c:if>
			<c:if test="${selectKind == 3 }">
				<input type="radio" name="selectKind" value="1"/>Q币
				<input type="radio" name="selectKind" value="2"/>羊城通
				<input type="radio" name="selectKind" value="3" checked/>所有
			</c:if>
			<input type="submit" value="确认"/>
		</form>
	</div>
	<table align="center" border="1" cellspacing="0" cellpadding="4" >
		<caption>订单查询</caption>
		<tr>
			<th>订单号</th>
			<th>操作用户</th>
			<th>商品名称</th>
			<th>商品数量</th>
			<th>交易金额</th>
			<th>交易时间</th>
			<th>订单状态</th>
		</tr>
		<c:forEach items="${OrderList }" var="checkOrderResponseRs">
			<tr>
				<td>${checkOrderResponseRs.id }</td>
				<td>${checkOrderResponseRs.username }</td>
				<td>${checkOrderResponseRs.productName }</td>
				<td>${checkOrderResponseRs.productNumber }</td>
				<td>${checkOrderResponseRs.totalPrice }</td>
				<td>${checkOrderResponseRs.dealTime }</td>
				<td>${checkOrderResponseRs.orderStatus }</td>
			</tr>
		</c:forEach>
	</table>
	<p id="p1">总金额:${totalPrice }</p>
	<div id="dividepage">
		<a href="?currentPage=1&selectStartYear=${selectStartYear }&selectStartMonth=${selectStartMonth }&selectStartDay=${selectStartDay }&selectEndYear=${selectEndYear }&selectEndMonth=${selectEndMonth }&selectEndDay=${selectEndDay }&selectKind=${selectKind }">首页</a>
		<c:choose>
			<c:when test="${currentPage>1}">
				<a href="?currentPage=${currentPage-1}&selectStartYear=${selectStartYear }&selectStartMonth=${selectStartMonth }&selectStartDay=${selectStartDay }&selectEndYear=${selectEndYear }&selectEndMonth=${selectEndMonth }&selectEndDay=${selectEndDay }&selectKind=${selectKind }">上一页</a>
			</c:when>
			<c:otherwise>
	                                上一页
	        </c:otherwise>
		</c:choose>
		<c:choose>
		    <c:when test="${currentPage<totalPage}">
		        <a href="?currentPage=${currentPage+1}&selectStartYear=${selectStartYear }&selectStartMonth=${selectStartMonth }&selectStartDay=${selectStartDay }&selectEndYear=${selectEndYear }&selectEndMonth=${selectEndMonth }&selectEndDay=${selectEndDay }&selectKind=${selectKind }">下一页</a>
		    </c:when>
		    <c:otherwise>
	                                下一页
	        </c:otherwise>
		</c:choose>
		<a href="?currentPage=${totalPage}&&selectStartYear=${selectStartYear }&selectStartMonth=${selectStartMonth }&selectStartDay=${selectStartDay }&selectEndYear=${selectEndYear }&selectEndMonth=${selectEndMonth }&selectEndDay=${selectEndDay }&selectKind=${selectKind }">尾页</a>
	
		<br /> 总条数:${totalCount},当前页:${currentPage}/${totalPage},一页大小:${pageSize}
	</div>
</body>
</html>