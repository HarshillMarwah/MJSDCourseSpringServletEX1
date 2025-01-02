package org.example;

import javax.servlet.http.HttpServlet;

public class HelloServlet extends HttpServlet {
    public void service(){
        System.out.println("Hi from Servlet");
    }
}
