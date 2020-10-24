package com.oms.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oms.dao.OrderDAO;
import com.oms.entity.Items;
import com.oms.entity.Orders;
import com.oms.entity.User;

public class OrderServices {
	private OrderDAO orderDao;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	public OrderServices(HttpServletRequest request, HttpServletResponse response) {
		super();
		this.request = request;
		this.response = response;
		this.orderDao=new OrderDAO();
	}
	
	public void placeOrder() throws ServletException, IOException {
		int quantity=(int) request.getSession().getAttribute("quantity");
		Items item = (Items) request.getSession().getAttribute("item");
		String r_name=request.getParameter("recipientName");
		String r_phone=request.getParameter("recipientPhone");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String zipcode=request.getParameter("zipcode");
		String country=request.getParameter("country");
		
		User user=new User();
		user.setId(1);
		
		Orders order=new Orders();
		order.setItems(item);
		order.setItemQuantity(quantity);
		order.setRecipientName(r_name);
		order.setRecipientPhone(r_phone);
		order.setShippingAddress(address.concat(", ").concat(city).concat(", ").concat(country).concat("- ").concat(zipcode) );
		order.setUser(user);
		order.setTotal(quantity*item.getPrice());
		order.setPaymentMethod("COD");
		
		orderDao.create(order);
		
		String message="Your order have been recieved. Thanks for shopping.";
		request.setAttribute("message", message);
		
		String messagePage="frontend/message.jsp";
		RequestDispatcher dispatcher=request.getRequestDispatcher(messagePage);
		dispatcher.forward(request, response);
		
	}
}
