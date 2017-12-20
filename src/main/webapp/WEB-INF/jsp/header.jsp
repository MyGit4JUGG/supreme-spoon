<%@ page pageEncoding="utf-8" 
contentType="text/html; charset=utf-8" %>
<%@ taglib 
	prefix="c" 
	uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 声明变量，表示项目的根路径 -->
<c:set 
	var="baseUri" 
	value="${pageContext.request.contextPath }"
	scope="request">
</c:set>

<style type="text/css">
* { margin: 0; padding: 0; font-family: '微软雅黑';
	color: #555; font-size: 14px; }
li { list-style: none; }
a { color: #555; text-decoration: none; }
a:hover { text-decoration: underline; }
#header_wrapper { border-bottom: 3px solid #aaa; 
	text-align: center; }
#header { width: 800px; height: 70px;
	overflow: auto; margin: 0 auto; }
#header h1 { float: left; line-height: 70px;
	background: #ccc; padding: 0 20px;
	font-size: 24px; }
#header ul { float: left; overflow: auto;
	margin: 0 0 0 20px; }
#header ul li { float: left; margin: 0 2px; }
#header ul li a { display: block; padding: 0 10px;
	font-size: 20px; line-height: 70px; }
#header ul li a:hover { text-decoration: none; 
	background: #ddd; }
#header ul li a.current { background: #eee; }
#header p { float: right; line-height: 70px;
	color: #999; }
#header p a { color: #666; }
#header p a:hover {}
</style>

<div id="header_wrapper">
	<div id="header">
		<h1>项目名称</h1>
		<ul>
			<li>
				<a href="${baseUri }/main/index" 
					<c:if test="${'index' eq current }">
						class="current"
					</c:if>
				>主页</a>
			</li>
			<li>
				<a href="${baseUri }/main/registerForm" 
					<c:if test="${'registerForm' eq current }">
						class="current"
					</c:if>
				>注册</a>
			</li>
			<li>
				<a href="${baseUri }/main/loginForm" 
					<c:if test="${'loginForm' eq current }">
						class="current"
					</c:if>
				>登录</a>
			</li>
		</ul>
		<p>
			请 <a href="${baseUri }/main/loginForm">登录</a> ！
		</p>
	</div>
</div>

<style type="text/css">
#content_wrapper { background: #f0f0f0; 
	text-align: center; }
#content { width: 760px; background: #fff; 
	margin: 0 auto; padding: 20px; 
	text-align: left; }
#content h3 { font-size: 20px; line-height: 50px; }

#form {}
#form .item { margin: 0 0 15px 0;}
#form .item h5 { font-weight: normal; font-size: 16px;
	line-height: 40px; }
#form .item .input { width: 350px; height: 36px; 
	background: #f3f3f3; padding: 0 10px;
	line-height: 36px; 
	border: 1px solid #aaa; border-radius: 5px; }
#form .item .input:focus { background: #fff; }
#form .item .button { line-height: 36px; 
	padding: 0 50px; margin: 10px 0 0 0;
	background: #0266cc; color: #fff;
	border-width: 0; border-radius: 5px; }
</style>







