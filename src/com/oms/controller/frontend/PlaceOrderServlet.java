package com.oms.controller.frontend;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oms.entity.Items;
import com.oms.entity.Orders;
import com.oms.entity.User;
import com.oms.service.OrderServices;

@WebServlet("/place_order")
public class PlaceOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PlaceOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrderServices orderServices=new OrderServices(request, response);
		orderServices.placeOrder();
		
		
	}

}
