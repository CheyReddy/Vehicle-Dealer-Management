<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<style>
body {
	background: linear-gradient(135deg, #4facfe, #00f2fe);
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
}

.login-card {
	width: 100%;
	max-width: 400px;
	padding: 2rem;
	background: #fff;
	border-radius: 15px;
	box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15);
}

.login-btn {
	width: 100%;
	border-radius: 10px;
}
</style>
</head>
<body>

	<div class="login-card">
		<h3 class="text-center mb-4">Login</h3>

		<%-- <form:form method="post"
			action="${pageContext.request.contextPath}/login"
			modelAttribute="dealer">

			<div class="mb-3">
				<label class="form-label">Email</label>
				<form:input path="email" type="email" cssClass="form-control"
					placeholder="Enter your email" required="true" />
				<form:errors path="email" cssClass="error" />
			</div>

			<div class="mb-3">
				<label class="form-label">Password</label>
				<form:password path="password" cssClass="form-control"
					placeholder="Enter your password" required="true" />
				<form:errors path="password" cssClass="error" />
			</div>

			<c:if test="${not empty error}">
				<div class="alert alert-danger">${error}</div>
			</c:if>

			<div style="color: green;">
				<c:if test="${not empty message}">${message}</c:if>
			</div>
			<button type="submit" class="btn btn-primary login-btn">Login</button>
		</form:form> --%>

		<form method="post" action="${pageContext.request.contextPath}/login">
			<input type="text" name="email" placeholder="Email" /> <input
				type="password" name="password" placeholder="Password" />
			<button type="submit">Login</button>
		</form>


		<div class="mt-3 text-center">
			<p>
				Don't have an account? <a
					href="${pageContext.request.contextPath}/register">Register</a>
			</p>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
