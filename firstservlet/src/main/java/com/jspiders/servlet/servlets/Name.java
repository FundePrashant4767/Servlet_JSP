package com.jspiders.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/name")
public class Name extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String name = null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("txt/html");
		PrintWriter writer=response.getWriter();
		
		writer.println("<h3> Welcome "+ name + "</h3>");
	}

}
