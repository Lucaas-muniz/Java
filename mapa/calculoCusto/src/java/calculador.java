/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calculador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /* Recebendo os parametros */
        Double valorG;
        valorG = Double.valueOf(request.getParameter("valorGas"));
        String modeloCarro;
        modeloCarro = request.getParameter("modelo");
        Double kmLitro;
        kmLitro = Double.valueOf(request.getParameter("custoPorKm"));
        Double mediaRevisao;
        mediaRevisao = Double.valueOf(request.getParameter("valorRevisao"));
        Double mediaPneu;
        mediaPneu = Double.valueOf(request.getParameter("valorPneu"));

        /* Efetuando os calculos */

        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* Conteudo */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculador de Custo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado do Cálculo:</h1><br>");
            out.println("<p>Veiculo modelo: " + modeloCarro + "</p>");
            out.println("<p>Valor da gasolina: " + valorG + "</p>");
            out.println("<p>Quantidade de Km por litro: " + kmLitro + "</p>");
            out.println("<p>Valor médio da revisão a cada 10 mil Km: " + mediaRevisao + "</p>");
            out.println("<p>Valor de 4 pneus  que rodam 50 mil Km: " + mediaPneu + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
    // + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
