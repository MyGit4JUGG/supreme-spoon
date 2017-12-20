<%@ page pageEncoding="utf-8" 
contentType="text/html; charset=utf-8" %>
<%@ taglib 
	prefix="c" 
	uri="http://java.sun.com/jsp/jstl/core" %>
<c:set 
	var="current" value="loginForm" 
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
				<h3>这是登录页面。</h3>
			</div>
		</div>
	</body>
</html>