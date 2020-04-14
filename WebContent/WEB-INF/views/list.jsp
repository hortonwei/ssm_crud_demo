<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书信息</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.7.2.min.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/style.css" />
</head>
<body>
	<table class="myTable">
		<tr class="myTitle">
			<th colspan="10">图书信息</th>
		</tr>
		<tr class="myTitle">
			<th>标题</th>
			<th>作者</th>
			<th>价格</th>
			<th>
				<form id="insertForm" action="${pageContext.request.contextPath }/book" method="post">
					<input type="hidden" name="_method" value="GET" />
					<input type="hidden" name="pageNum" value="${page.pageNum }">
					操作<br>
					<input type="submit" value="添加">
				</form>
			</th>
		</tr>
		<c:forEach items="${page.list }" var="book">
			<tr>
				<td>${book.title }</td>
				<td>${book.author }</td>
				<td>${book.price }</td>
				<td>
					<a class="deleteA" href="${pageContext.request.contextPath }/book/${book.id }">删除</a>

					<a class="updateA" href="${pageContext.request.contextPath }/book/${book.id }">修改</a>
<%-- 					<form id="updateForm" method="post">
						<input type="hidden" name="_method" value="PUT" />
						<input type="hidden" name="pageNum" value="${page.pageNum}">
						<input type="hidden" name="id" value="${book.id}">
						<input type="hidden" name="title" value="${book.title}">
						<input type="hidden" name="author" value="${book.author}">
						<input type="hidden" name="price" value="${book.price}">
					</form> --%>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				
				<c:if test="${!page.isFirstPage }">
					<a href="${pageContext.request.contextPath }/books/1">首页</a>
					<a href="${pageContext.request.contextPath }/books/${page.prePage}">上一页</a>
				</c:if>
				
				<c:forEach items="${page.navigatepageNums }" var="num">
					<c:if test="${num==page.pageNum }">
						<a href="${pageContext.request.contextPath }/books/${num}" style="color: red;">[${num}]</a>
					</c:if>
					<c:if test="${num!=page.pageNum }">
						<a href="${pageContext.request.contextPath }/books/${num}">${num}</a>
					</c:if>
				</c:forEach>
				
				<c:if test="${!page.isLastPage }">
					<a href="${pageContext.request.contextPath }/books/${page.nextPage}">下一页</a>
					<a href="${pageContext.request.contextPath }/books/${page.pages}">末页</a>
				</c:if>
				当前${page.pageNum }/${page.pages }，总${page.total }条
			</td>
		</tr>
	</table>

	<div align="center">
		<h1>HellWorld 2020</h1>
	</div>
					<form id="deleteForm" method="post">
						<input type="hidden" name="_method" value="DELETE" />
						<input type="hidden" name="pageNum" value="${page.pageNum}">
					</form>
					<form id="updateForm" method="post">
						<input type="hidden" name="_method" value="PUT" />
						<input type="hidden" name="pageNum" value="${page.pageNum}">
					</form>

</body>
<script type="text/javascript">
		$(".updateA").click(function () {
			if(confirm("confirm update?")){
				var url = $(this).attr("href");
				$("#updateForm").attr("action",url);
				$("#updateForm").submit();
		}
		return false;
		});
		$(".deleteA").click(function () {
			if(confirm("confirm delete?")){
				var url = $(this).attr("href");
				$("#deleteForm").attr("action",url);
				$("#deleteForm").submit();
			}
			return false;
		});
</script>
</html>