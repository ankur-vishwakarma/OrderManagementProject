<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OMS</title>
</head>
<body>
	<form action="update_order" method="post" id="orderForm">
		<div>
			<table align="center" border="1">
				<tr>
					<th>Item</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Total</th>
				</tr>
				<tr>
					<td><b>${item.name}</b></td>
					<td><i>${item.price}</i></td>
					<td>
						<input type="hidden" name="id" value="${item.id}" />
						<input type="text" name="quantity" value="${quantity}" size="5" />
					</td>
					<td><i>${quantity*item.price}</i></td>
				</tr>
			</table>
		</div>
		<div align="center">
			<table class="normal">
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td></td>
					<td><button type="submit">Update</button></td>
					<td><a href="${pageContext.request.contextPath}/">Continue
							Shopping</a></td>
					<td><a href="checkout">CheckOut</a></td>
				</tr>
			</table>
		</div>
	</form>

</body>
</html>