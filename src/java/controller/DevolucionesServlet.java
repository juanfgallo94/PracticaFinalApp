/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.DevolucionesDaoLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TblDevoluciones;

/**
 *
 * @author dalejandro.higuita
 */
@WebServlet(name="DevolucionesServlet", urlPatterns={"/DevolucionesServlet"})
public class DevolucionesServlet extends HttpServlet {

    @EJB
    private DevolucionesDaoLocal devolucionesDao;

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
       String placa= request.getParameter("placa");
       String fecha= request.getParameter("fecha");
       String motivo= request.getParameter("motivo");      
       TblDevoluciones devolucion=new TblDevoluciones(id,placa,fecha,motivo);
        
       if("Add".equalsIgnoreCase(action)){
       devolucionesDao.addDevolucion(devolucion);
       
   }  else  if("Edit".equalsIgnoreCase(action)){
           devolucionesDao.editDevolucion(devolucion);
           
   }else   if("Delete".equalsIgnoreCase(action)){
           devolucionesDao.deleteDevolucion(id);
   
    }else  if("Search".equalsIgnoreCase(action)){
           devolucion=devolucionesDao.getDevolucion(id);
    }
       
  request.setAttribute("devolucion",devolucion);
  request.setAttribute("allDevolucion", devolucionesDao.getAllDevolucion());
  request.getRequestDispatcher("devoluciones.jsp").forward(request, response);
  response.sendRedirect("devoluciones.jsp");
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
