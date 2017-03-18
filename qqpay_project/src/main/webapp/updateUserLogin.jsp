<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>北大小鸟用户信息</title>
</head>
<body>

	<form action=textUpdateUser.action>
	<table align="center" border="1" cellpadding="1" cellspacing="1">
	<caption>用户修改密码<br><br><br></caption>
	<tr>
		<td>
			<label>&nbsp;用户ID:&nbsp;<input type="text" name="userId"  ></label>			
		</td>
	</tr>
	<tr>
		<td>
			<label>&nbsp;用户名:&nbsp;<input type="text" name="userName" ></label>
		</td>
	</tr>
	<tr>
		<td>
			<label>请输入新密码:<input type="password" name="password" ></label>
		</td>
	</tr>
	<tr>
		<td colspan="3" align="right">
			<input type="reset"  value="重置"/>
			<input type="submit"  value="提交"/>
		</td>
	</tr>
	<tr>
		<td colspan="3">
		<label>密码修改成功后会跳转到登陆界面</label>	
		</td>
	</tr>
	</table>
	</form>
</body>
</html>