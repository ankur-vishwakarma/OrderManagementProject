<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center" style="width: 80%; margin: 0 auto;">
			<h2>Your Shipping Information</h2>
				<form id="orderForm" action="place_order" method="post">
				<table>
					<tr>
						<td><b>Item Name:</b></td>
						<td><b>${item.name}</b></td>
					</tr>
					
					<tr>
						<td><b>Item Price:</b></td>
						<td><i>Rs.${item.price}</i></td>
					</tr>
					
					<tr>
						<td><b>Quantity:</b></td>
						<td>${quantity}</td>
					</tr>
					
					<tr>
						<td><b>Total:</b></td>
						<td><b>Rs.${item.price * quantity}</b></td>
					</tr>
				
					<tr>
						<td>Recipient Name:</td>
						<td><input type="text" name="recipientName"  /></td>
					</tr>
					<tr>
						<td>Recipient Phone:</td>
						<td><input type="text" name="recipientPhone"  /></td>
					</tr>
					<tr>
						<td>Street Address:</td>
						<td><input type="text" name="address"/></td>
					</tr>
					<tr>
						<td>City:</td>
						<td><input type="text" name="city"  /></td>
					</tr>
					<tr>
						<td>Zip Code:</td>
						<td><input type="text" name="zipcode" /></td>
					</tr>
					<tr>
						<td>Country:</td>
						<td><input type="text" name="country" /></td>
					</tr>
				</table>

					<div>
						<h2>Payment</h2>
						Choose your payment method: &nbsp;&nbsp;&nbsp; <select
							name="paymentMethod">
							<option value="Cash On Delivery">Cash On Delivery</option>
						</select>
					</div>

					<div>
						<table class="normal">
							<tr>
								<td>&nbsp;</td>
							</tr>

							<tr>
								<td></td>
								<td><button type="submit">Place Order</button></td>
								<td><a href="${pageContext.request.contextPath}/">Continue
										Shopping</a></td>
							</tr>
						</table>
					</div>
				</form>
		</div>
</body>
</html>