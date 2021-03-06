/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author civan
 */
@WebServlet(name = "ServletHeaders", urlPatterns = {"/ServletHeaders"})
public class ServletHeaders extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            String metodoHttp = request.getMethod();
            String uri = request.getRequestURI();
            String host = request.getHeader("Host");
            String navegador = request.getHeader("User-Agent");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletHeaders</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Headers HTTP</h1>");
            out.println("Metodo Http: "+ metodoHttp);
            out.println("<br>");
            out.println("URI solicitad: "+ uri);
            out.println("<br>");
            
            out.println("<br>");
            out.println("Host: "+ host);
            out.println("<br>");
            out.println("Navegador: "+ navegador);
            out.println("<br>");
            out.println("<br>");
            
            Enumeration cabeceros = request.getHeaderNames();
            while (cabeceros.hasMoreElements()){
                String nombreCabecero = (String) cabeceros.nextElement();
                out.println("<b>"+ nombreCabecero + "</b>");
                out.println(request.getHeader(nombreCabecero));
                out.println("<br>");
            }
            
            
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }

}
