package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/HTML");
        PrintWriter printWriter = res.getWriter();
        printWriter.println("<h2><b>Hii from doGET </b> </h2>");
        System.out.println("Hi from Servlet");
    }
    /*public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/HTML");
        PrintWriter printWriter = res.getWriter();
        printWriter.println("Hii from Service");
        System.out.println("Hi from Servlet");
    }*/

}
