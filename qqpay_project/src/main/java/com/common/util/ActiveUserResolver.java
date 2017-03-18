package com.common.util;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

import com.base.pojo.vo.ActiveUser;

/**
 * 
 *  权限校验，用户校验
 * @author lico
 *
 */


public class ActiveUserResolver implements WebArgumentResolver {

	
	
	@Override
	public Object resolveArgument(MethodParameter methodParameter,
			NativeWebRequest webRequest) throws Exception {
		 
	if(	methodParameter.getParameterType().equals(ActiveUser.class)){
		
		ActiveUser activeUser = (ActiveUser) webRequest.getAttribute("activeuser", webRequest.SCOPE_SESSION);
		
		return activeUser;
		}
		
		return UNRESOLVED;
	}

}
