package com.base.service.impl;

 
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.base.dao.mapper.UserSelectCustomMapper;
import com.base.dao.mapper.User_StatusMapper;
import com.base.pojo.po.User_Status;
import com.base.pojo.vo.UserSelectCustom;
import com.base.service.LoginUserService;
import com.common.util.UUIDBuild; 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import com.base.dao.mapper.UserSelectCustomMapper; 
import com.base.pojo.vo.UserSelectCustom;
import com.base.service.LoginUserService;
 
 
public class LoginServiceImpl implements LoginUserService {
	
	 
	@Autowired
	private UserSelectCustomMapper userSelectCustomMapper;
	
 
	@Autowired
	private User_StatusMapper user_StatusMapper;
	
 
 
	/**
	 *  校验用户信息
	 * @param userid
	 * @throws Exception
	 */
	public UserSelectCustom checkUserByName(String userName,String pwd) throws Exception{
		
		
		
		UserSelectCustom userSelectCustom = new UserSelectCustom();
		userSelectCustom.setUserName(userName); 
		List<UserSelectCustom> list = userSelectCustomMapper.selectUserCustomList(userSelectCustom);
		
		
		if (list.size()<=0){
			
			throw new Exception("用户不存在或密码错误");
			
		}
		
		userSelectCustom=list.get(0);
		
 
		if(userSelectCustom.getOPERATION_TIMES()!=null&&userSelectCustom.getOPERATION_TIMES()>3){
			
			throw new Exception("用户被锁定");
		}  
	
		if (!userSelectCustom.getPassword().equals(pwd)){ 
			
			
			User_Status userStatus = user_StatusMapper.selectByPrimaryKey(userSelectCustom.getUserstatusid());	
			
			if(userStatus==null){
				
				userStatus=new User_Status();
				userStatus.setId(UUIDBuild.getUUID());
				userStatus.setUserId(userSelectCustom.getUserId());
				userStatus.setOperationTimes(0);
				userStatus.setLastOperationTime(new Date());
				user_StatusMapper.insert(userStatus);
				
			}
			
			
			Integer operationTimes =  userStatus.getOperationTimes();
			
			if(operationTimes==null||operationTimes==0||operationTimes.equals("")){
				
				operationTimes=1;
			}else{
				
				operationTimes=operationTimes+1;
			}
			
			userStatus.setOperationTimes(operationTimes);
						
			user_StatusMapper.updateByPrimaryKey(userStatus);
			
		}
 
		if (!userSelectCustom.getPassword().equals(pwd)){
 
			
			throw new Exception("用户不存在或密码错误");
			
		} 
	
		 
 
		if(userSelectCustom.getOPERATION_TIMES()!=null&&userSelectCustom.getOPERATION_TIMES()>=3){
			
			throw new Exception("用户被锁定");
		}
 
		
		
		return userSelectCustom;
		
	} 
	 

}
