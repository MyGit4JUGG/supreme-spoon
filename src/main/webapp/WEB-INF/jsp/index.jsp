<%@ page pageEncoding="utf-8" 
contentType="text/html; charset=utf-8" %>
<%@ taglib 
	prefix="c" 
	uri="http://java.sun.com/jsp/jstl/core" %>
<c:set 
	var="current" value="index" 
	scope="request">
</c:set>
<html>
	<head>
		<title>SSH Project</title>
	</head>
	<body>
		<!-- 引用header.jsp -->
		<c:import url="header.jsp"></c:import>
	
		<div id="content_wrapper">
			<div id="content">
				<h3>欢迎您！${session.username }。</h3>
				<h3>这是使用SSH实现的小项目的主页。</h3>
			</div>
		</div>
	</body>
</html>