package com.oms.controller.frontend;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oms.entity.Items;
import com.oms.service.ItemServices;

@WebServlet("/order_item")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ItemServices itemServices =new ItemServices(request, response);
		itemServices.getItemDetail();
		
		String orderPage = "frontend/orderpage.jsp";
		RequestDispatcher requestDispatcher=request.getRequestDispatcher(orderPage);
		requestDispatcher.forward(request, response);
		
		//request.setAttribute("itemId", itemId);
		 
		
		/*String orderpage= "frontend/orderpage.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(orderpage);
		dispatcher.forward(request, response);*/
	}

}
