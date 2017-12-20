<%@ page pageEncoding="utf-8" 
contentType="text/html; charset=utf-8" %>
<%@ taglib 
	prefix="c" 
	uri="http://java.sun.com/jsp/jstl/core" %>
<c:set 
	var="current" value="registerForm" 
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
				<h3>用户注册</h3>
				
				<div id="form">
					<form name="register" method="post"
						action="${baseUri }/main/register">
						<div class="item">
							<h5>用户名</h5>
							<div><input class="input"
								type="text"
								name="user.username" /></div>
						</div>
						<div class="item">
							<h5>密码</h5>
							<div><input class="input"
								type="text"
								name="user.password" /></div>
						</div>
						<div class="item">
							<h5>手机号码</h5>
							<div><input class="input"
								type="text"
								name="user.mobilePhoneNumber" /></div>
						</div>
						<div class="item">
							<h5>电子邮件</h5>
							<div><input class="input"
								type="text"
								name="user.email" /></div>
						</div>
						<div class="item">
							<div><input class="button"
								type="submit"
								value="注册" /></div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>