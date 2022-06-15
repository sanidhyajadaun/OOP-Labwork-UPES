package com.san;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;


/**
 * Servlet implementation class Calculator
 */
public class Calculator extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int n1=Integer.parseInt(request.getParameter("num1"));
        int n2=Integer.parseInt(request.getParameter("num2"));
        String op = request.getParameter("operator");
        
        if(op.equals("add"))
        {
            out.print("Addition of "+n1+" and "+n2+" : "+(n1+n2));
        }
        else if(op.equals("sub"))
        {
            out.print("Subtraction of "+n1+" and "+n2+" : "+(n1-n2));
        }
        else if(op.equals("multiply"))
        {
            out.print("Multiplication of "+n1+" and "+n2+" : "+(n1*n2));
        }
        else if(op.equals("divide"))
        {
            out.print("Division of "+n1+" and "+n2+" : "+(n1/n2));
        }
        
    }
}

