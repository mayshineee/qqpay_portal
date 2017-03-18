<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<form action="recharge.action" >
		
		<div align="center">
			<label >商品名称:</label>
			QQ币：<input type="radio" name="productId" value="1"  >
			V币：<input type="radio" name="productId"  value="2"/>
		</div>
			<br>
		<div align="center">	
			<label>购买数量:</label>
			<input type="text" name="stockNumber" />
		</div>
		
		 <div align="center">
		 	
		 	<input type="submit" value="提交">
		 </div>
		</form>


</body>
</html>