package com.xworkz.fridge;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FridgeServlet extends HttpServlet {

	
		public FridgeServlet() {
			System.out.println("Created Fridge Servlet..!");
		}
	
	@Override
	protected void service(HttpServletRequest reqs, HttpServletResponse response) throws ServletException, IOException {
	
		
		String brand = reqs.getParameter("brand");
		String color = reqs.getParameter("color");
		String price = reqs.getParameter("price");
		
		System.out.println("Brand:"+brand);
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);
		
		response.setContentType("text/html");
		PrintWriter htmlWriter=response.getWriter();
		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
		htmlWriter.print("Saved Sucessfully for :"+brand);
		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
	}
}
