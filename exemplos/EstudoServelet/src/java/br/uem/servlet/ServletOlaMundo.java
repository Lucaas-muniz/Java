/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uem.servlet;

import java.io.IoException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletOlaMundo extends HttpServlet {
    @Override
    public void init () throws ServletException{
        super.init();
        System.out.println("Inicializando");
    }
    
    @Override9
    protected void doGet(HttpServletRequest req,
    HttpServletResponse resp)
    throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println(“<h1>Olá mundo</h1>”);
        out.close();
}
    
   
    @Override
    public void destroy() {
        System.out.println(“Destruindo...”);
        super.destroy();
}
}
