<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OMS</title>
</head>
<body>
	<div align="center">
		<div align="center" style="width: 80%; margin: 0 auto;">
			<h2>Items</h2>
			<c:forEach items="${items}" var="item">
				<div style="display: inline-block; margin: 20px;">
					<div>
						<b>${item.name}</b>
					</div>
					
					<div>
						<i>Rs.${item.price}</i>
					</div>
					
					<div>
						<a href="order_item?id=${item.id}">
							Order Now
						</a>
					</div>
					
				</div>
				<br/>
			</c:forEach>
		</div>

	</div>
</body>
</html>