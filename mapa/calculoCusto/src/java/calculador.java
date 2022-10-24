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
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /* Recebendo os parametros e convertendo se necessário*/
        String modeloCarro;
        modeloCarro = request.getParameter("modelo");
        
        String strValorG;
        Double valorG;
        strValorG = request.getParameter("valorGas");
        valorG = Double.parseDouble(strValorG.replace(',', '.'));
       
        String strKm;
        Double kmLitro;
        strKm = request.getParameter("custoPorKm");
        kmLitro = Double.parseDouble(strKm.replace(',', '.'));
        
        String strRev;
        Double mediaRevisao;
        strRev = request.getParameter("valorRevisao");
        mediaRevisao = Double.parseDouble(strRev.replace(',', '.'));
        
        String strPn;
        Double mediaPneu;
        strPn = request.getParameter("valorPneu");
        mediaPneu = Double.parseDouble(strPn.replace(',', '.'));

        /* Efetuando os calculos */
        Double valorRodado;
        Double valorTotal;
        valorRodado = (valorG / kmLitro) + (mediaRevisao / 10000) + (mediaPneu / 50000);
        valorTotal = valorRodado * 1.15;

        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* Conteudo */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculador de Custo</title>");
            out.println("<link rel= 'stylesheet' href= 'style.css'/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header class= header-content>\n"
                    + "        <h1>Resultado do Cálculo:</h1>\n"
                    + "    </header>");
            out.println("<article class= content2>");
            out.println("<p>Veículo modelo: <span>" + modeloCarro + "</span></p>");
            out.println("<p>Valor da gasolina:<span> R$ " + valorG + "</span></p>");
            out.println("<p>Quantidade de Km por litro: <span>" + kmLitro + " Km</span></p>");
            out.println("<p>Valor médio da revisão a cada 10 mil Km:<span> R$ " + mediaRevisao + "</span></p>");
            out.println("<p>Valor de 4 pneus  que rodam 50 mil Km:<span> R$ " + mediaPneu + "</span></p>");
            out.println("<p>Valor do Km rodado: <span>" + valorRodado + "</span></p>");
            out.println("<p>Valor do Km rodado com acréscimo de 15%: <span>" + valorTotal + "</span></p>");
            out.println("<a href=index.html><button class= botao2>Voltar</button></a>");
            out.println("</article>");
            out.println("<footer>\n"
                    + "        <p id=\"rodape\">Desenvolvido por Lucas Muniz</p>\n"
                    + "    </footer>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
    // + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
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
