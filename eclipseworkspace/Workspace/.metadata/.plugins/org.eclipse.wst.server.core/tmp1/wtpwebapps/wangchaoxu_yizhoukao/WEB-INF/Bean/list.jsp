<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=path %>/js/index2.css" type="text/css"></link>
<script type="text/javascript" src="<%=path %>/js/jquery-1.8.2.min.js"></script></head>
<body>
	<center>
		<table>
			<tr>
				<td>id</td>
				<td>name</td>
				<td>age</td>
				<td>hobby</td>
				<td>content</td>
				<td>datea</td>
				<td>dept</td>
				<td><a href="Bean_add">添加</a></td>
			</tr>
			<c:forEach items="${list }" var="s">
				<tr>
					<td>${s.id }</td>
					<td>${s.name }</td>
					<td>${s.age }</td>
					<td>${s.hobby }</td>
					<td>${s.content }</td>
					<td>${s.datea }</td>
					<td>${s.dept.dname }</td>
					<td><a href="Bean_update?id=${s.id }">修改</a></td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>