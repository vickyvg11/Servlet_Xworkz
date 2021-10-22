package com.xworkz.fridge;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PanasonicServlet extends HttpServlet {
	public PanasonicServlet () {
		System.out.println("Created the Servlet of Bosch");
	}



	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String brand = req.getParameter("brand");
		String color = req.getParameter("color");
		String price = req.getParameter("price");

		System.out.println("Brand:"+brand);
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);

		resp.setContentType("text/html");
		PrintWriter htmlWriter=resp.getWriter();
		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
		htmlWriter.print("Saved Sucessfully for :"+brand);
		htmlWriter.print("<html>");
		htmlWriter.print("<body>");


	}
}
