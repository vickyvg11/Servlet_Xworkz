package com.xworkz.gym;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GymServlet  extends HttpServlet{

	
	public GymServlet() {
		System.out.println("GymServlet is Created");
	
	}
	
	
	@Override
	protected void service(HttpServletRequest reqs, HttpServletResponse resp) throws ServletException, IOException {
		
	
		
		System.out.println("invoked service in gym servlet");

		String name = reqs.getParameter("gymName");
		System.out.println("Gym name ".concat(name));

		String loc = reqs.getParameter("gymLocation");
		System.out.println("Gym loaction " + (loc));

		String gymFees = reqs.getParameter("gymFees");
		System.out.println("Gym fee ".concat(gymFees));

		String gymRating = reqs.getParameter("gymRating");
		System.out.println("Gym ratings ".concat(gymRating));

		String gymReviews = reqs.getParameter("gymReview");
		System.out.println("Gym reviews ".concat(gymReviews));

		String gymContact = reqs.getParameter("gymContact");
		System.out.println("Gym contact number ".concat(gymContact));

		System.out.println("response");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#FFC0CB'>");
		out.print("<h1>");
		out.print("Details saved for".concat(name));
		out.print("<br>");
		out.print("Location:".concat(loc));
		out.print("<br>");
		out.print("Fees:".concat(gymFees));
		out.print("<br>");
		out.print("Ratings:".concat(gymRating));
		out.print("<br>");
		out.print("Reviews:".concat(gymReviews));
		out.print("<br>");
		out.print("Contact:".concat(gymContact));
		out.print("<br>");
		out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		
	}
}
