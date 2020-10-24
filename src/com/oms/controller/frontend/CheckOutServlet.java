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


@WebServlet("/checkout")
public class CheckOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CheckOutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int quantity=(int) request.getSession().getAttribute("quantity");
		
		Items item = (Items) request.getSession().getAttribute("item");

		System.out.println(quantity + item.getName());
		
		//request.getSession().removeAttribute("quantity");
		//request.getSession().removeAttribute("item");
		
		request.setAttribute("quantity", quantity);
		request.setAttribute("item", item);
		
		String checkoutPage = "frontend/checkout.jsp";
		RequestDispatcher requestDispatcher=request.getRequestDispatcher(checkoutPage);
		requestDispatcher.forward(request, response);
		
		
	}

}
