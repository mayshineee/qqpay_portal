<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品库存信息</title>
</head>
<body>
	<table align="center" border="1" cellpadding="1" cellspacing="1">
	<tr>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>商品数量</td>
			<td>总金额</td>
		</tr>
	<c:forEach items="${productList}" var="ProductStock">
		<tr>
			<td>${ProductStock.p_NAME }</td>
			<td>${ProductStock.p_PRICE }</td>
			<td>${ProductStock.s_NUMBER }</td>
			<td>${ProductStock.s_NUMBER * ProductStock.p_PRICE }</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>