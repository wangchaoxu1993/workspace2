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
<script type="text/javascript">
	$(function(){
		$("select").val("${bean.dept.did}");
		var hs = "${bean.hobby}";
		var hh = hs.split(",");
		for(var i=0;i<hh.length;i++){
			$("[name='hobbys'][value='"+hh[i]+"']").prop("checked",true);
		}
	})
</script>
<body>
	<center>
		<form action="Bean_toupdate" method="post">
			<table>
				<tr>
					<td>
						姓名<input name="bean.id" value="${bean.id }">
					</td>
				</tr>
				<tr>
					<td>
						姓名<input name="bean.name" value="${bean.name }">
					</td>
				</tr>
				<tr>
					<td>
						年龄<input name="bean.age" value="${bean.age }">
					</td>
				</tr>
				<tr>
					<td>
						爱好<input type="checkbox" name="hobbys" value="音乐">音乐
						   <input type="checkbox" name="hobbys" value="电影">电影
						   <input type="checkbox" name="hobbys" value="工作">工作
						   <input type="checkbox" name="hobbys" value="购物">购物
					</td>
				</tr>
				<tr>
					<td>
						简介<input name="bean.content" value="${bean.content }">
					</td>
				</tr>
				<tr>
					<td>
						入职时间<input name="bean.datea" value="${bean.datea }">
					</td>
				</tr>
				<tr>
					<td>
						部门<select name="bean.dept.did">
							<c:forEach items="${dlist }" var="d">
								<option value="${d.did }">${d.dname }</option>
							</c:forEach>
						   </select>
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="保存">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>