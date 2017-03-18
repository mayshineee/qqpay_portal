<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    
<% 
String basepath = request.getContextPath();  
session.setAttribute("basepath", basepath);
%> 
    
<script type="text/javascript" src="${basepath}/js/jquery-1.4.4.min.js"></script>

<link rel="stylesheet" href="${basepath}/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">  
<script type="text/javascript" src="${basepath}/ztree/js/jquery.ztree.core-3.5.min.js"></script>
<script type="text/javascript" src="${basepath}/ztree/js/jquery.ztree.excheck-3.5.min.js"></script>

<script type="text/javascript" src="${basepath}/js/formvalidator/formValidator-4.0.1.js"></script>

<script type="text/javascript">
//*****************表单校验******************
$(document).ready(function(){	
	$.formValidator.initConfig({
		formID : "userLoginForm",
		mode:'AlertTip',
		onError : function(msg) {
			alert(msg);
		},
		onAlert : function(msg) {
			alert(msg);
		}
	});
	$("#userName").formValidator({
		onShow : "",
		onCorrect:"&nbsp;"
	}).inputValidator({
		min : 1,
		onError:"请输入用户名"
	});
	$("#password").formValidator({
		onShow : "",
		onCorrect:"&nbsp;"
	}).inputValidator({
		min : 1,
		onError:"请输入密码"
	});
	$("#randomcode").formValidator({
		onShow : "",
		onCorrect:"&nbsp;"
	}).inputValidator({
		min : 1,
		onError:"请输入验证码"
	});
	 
});

//校验表单输入
function checkinput() {
	//return $('#loginform').form('validate');
	return $.formValidator.pageIsValid();
}

//刷新验证码
function randomcode_refresh() {
	$("#randomcode_img").attr('src',
			'${baseurl}validatecode.jsp?time' + new Date().getTime());
};


//提交登录表单
function userLoginSubmit(){ 
	
	if(checkinput()){
		
		$.ajax({
			
			url : 'user/login.action',
			type : 'POST',
			data:$('#userLoginForm').serialize(),// 你的formid
			dataType : 'json',
			success : function(data) {
				 			 $("#info").empty();
				 			 $("#activeUser").empty();
				 $.each(data.messageList, function(i, msg) {
						 
			            $("#info").append(
			                    "<div>信息：" + msg.message + "</div>" ); 
			         
			        });
				 
				  	 var success = data.success;
		            if(success=="1"){alert("在此写跳转页面代码");
		            $("#activeUser").append("<div>session 里面的 ActiveUser 信息：<br>"+"${activeUser}"+ "</div>");
		            randomcode_refresh();
		            };
				 
			},
			error : function(msg) {
				alert('加载异常!');
			}
		});
		
	}
	
	
};
 
</script>
 
<h2>user login</h2>  


	<form id="userLoginForm" action="user/login.action" method="get">
	用户登录<br>
	<input type="text" name="userName" id="userName">用户名<br>
	<input type="text" name="password" id="password">密码<br>  
	<input id="randomcode" name="validateCode" size="8" /> 验证码：<br>
	<img id="randomcode_img" src="${baseurl}validatecode.jsp" alt=""
		width="56" height="20" align='absMiddle' /> <a
		href=javascript:randomcode_refresh()>刷新</a> <br>
	<input type="button" id="btn1" value="登录" onclick="userLoginSubmit()"><br>
	
	</form>
	<div id="info"></div>
	
	<div id="activeUser"></div>
	
</body>
</html>
