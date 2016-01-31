<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp"%>

<h1>${user.name}</h1>

<c:forEach items="${user.blogs}" var="blog">
	<h2>${blog.name}</h2>
	<h2>${blog.url}</h2>

	<table class="table table-hover table-bordered table-striped">
		<thead>
			<tr>
				<th>Title</th>
				<th>Link</th>
			</tr>
		</thead>
		<tbody>
		
		<c:forEach items="${blog.items}" var="item">
		<tr>
		<td>${item.title}</td>
		<td>${item.link}</td>
		</tr>
		</c:forEach>
		
		
		</tbody>

	</table>


</c:forEach>