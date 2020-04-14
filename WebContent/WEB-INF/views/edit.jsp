<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改图书</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/style.css" />
</head>
<body>
	<form action="${pageContext.request.contextPath }/books" method="post">
		<input type="hidden" name="_method" value="PUT" />
		<input type="hidden" name="id" value="${book.id }">
		<input type="hidden" name="pageNum" value="${pageNum }">
		<table class="myTable">
			<tr class="myTitle">
				<th colspan="10">修改图书</th>
			</tr>
			<tr class="myTitle">
				<th>标题</th>
				<th>作者</th>
				<th>价格</th>
				<th>操作</th>
			</tr>
			<tr>
				
				<td><input type="text" name="title" value="${book.title }"></td>
				<td><input type="text" name="author" value="${book.author }"></td>
				<td><input type="text" name="price" value="${book.price }"></td>
				<td><input type="submit" value="	提交  	"></td>
			</tr>

		</table>
	</form>
	<div align="center">
		<h1>HellWorld 2020</h1>
	</div>
</body>
</html>