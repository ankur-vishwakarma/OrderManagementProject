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


@WebServlet("/update_order")
public class UpdateOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdateOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ItemServices itemServices =new ItemServices(request, response);
		itemServices.getItemDetail();
		
		String orderPage = "frontend/orderpage.jsp";
		RequestDispatcher requestDispatcher=request.getRequestDispatcher(orderPage);
		requestDispatcher.forward(request, response);
		
	}

}
