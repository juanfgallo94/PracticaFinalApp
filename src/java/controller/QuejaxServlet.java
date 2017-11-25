/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.QuejasDaoLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TblQueja;

/**
 *
 * @author dalejandro.higuita
 */
@WebServlet(name="QuejaxServlet", urlPatterns={"/QuejaxServlet"})
public class QuejaxServlet extends HttpServlet {

    @EJB
    private QuejasDaoLocal quejasDao;

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String action=request.getParameter("action");
       String id= request.getParameter("id");
       String fechaQueja= request.getParameter("fechaQueja");
       String textoQueja= request.getParameter("textoQueja");
       String responsable= request.getParameter("responsable");      
       TblQueja queja=new TblQueja(id,fechaQueja,textoQueja,responsable);
        
       if("Add".equalsIgnoreCase(action)){
       quejasDao.addQueja(queja);
       
   }  else  if("Edit".equalsIgnoreCase(action)){
           quejasDao.editQueja(queja);
           
   }else   if("Delete".equalsIgnoreCase(action)){
           quejasDao.deleteQueja(id);
   
    }else  if("Search".equalsIgnoreCase(action)){
           queja=quejasDao.getQueja(id);
    }
       
  request.setAttribute("queja",queja);
  request.setAttribute("allQueja", quejasDao.getAllQueja());
  request.getRequestDispatcher("quejas.jsp").forward(request, response);
  response.sendRedirect("quejas.jsp");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
