package com.oms.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.oms.dao.ItemsDAO;
import com.oms.entity.Items;

public class ItemServices {
	private ItemsDAO itemsDAO;
	private HttpServletRequest request;
	private HttpServletResponse response;

	public ItemServices(HttpServletRequest request, HttpServletResponse response) {
		super();
		this.request = request;
		this.response = response;
		itemsDAO = new ItemsDAO();
	}
	
	public void getItemDetail() throws ServletException, IOException {
		Integer itemId = Integer.parseInt(request.getParameter("id"));
		Items item=itemsDAO.get(itemId);
		
		request.setAttribute("item", item);
		
		if (!request.getParameterMap().containsKey("quantity")) {
			request.setAttribute("quantity", 1);
		}else {
			String quantity=request.getParameter("quantity");
			request.setAttribute("quantity",quantity);
		}
		
		
		
		
	}
	
	public void updateOrder() throws ServletException, IOException {
		String quantity=request.getParameter("quantity");
		
		Integer itemId = Integer.parseInt(request.getParameter("itemId"));
		Items item=itemsDAO.get(itemId);
		
		request.setAttribute("item", item);
		request.setAttribute("quantity",quantity);
		
		String orderPage = "frontend/orderpage.jsp";
		RequestDispatcher requestDispatcher=request.getRequestDispatcher(orderPage);
		requestDispatcher.forward(request, response);
		
		/*String cartPage=request.getContextPath().concat("/view_cart"); //carts url
		response.sendRedirect(cartPage);*/
	}
}
