/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.lpii_second;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author prantony
 */
public class ControllerHelper extends BaseHelper{
    protected DataBeen datos;    
    public ControllerHelper(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) {
        super(servlet, request, response);
        datos = new DataBeen();
    }
    public DataBeen getDatos() {
        return datos;
    }    
    public void do_get(){
        try {
             String direccion;
             request.getSession().setAttribute("ayudante", this);
             datos.setTr1(request.getParameter("tr1"));
             datos.setTr2(request.getParameter("tr2"));
             datos.setTr3(request.getParameter("tr3"));
             datos.setTr4(request.getParameter("tr4"));
             datos.setTr5(request.getParameter("tr5"));
             
             datos.setExm1(request.getParameter("exm1"));
             datos.setExm2(request.getParameter("exm2"));
             datos.setExm3(request.getParameter("exm3"));
             datos.setExm4(request.getParameter("exm4"));
             datos.setExm5(request.getParameter("exm5"));
             
             datos.setInv1(request.getParameter("inv1"));
             datos.setInv2(request.getParameter("inv2"));

             datos.setPrt1(request.getParameter("prt1"));
             datos.setPrt2(request.getParameter("prt2"));
             datos.setPrt3(request.getParameter("prt3"));
             datos.setPrt4(request.getParameter("prt4"));
             datos.setPrt5(request.getParameter("prt5"));
             
             datos.setEfnl(request.getParameter("efnl"));
             
             
             if (request.getParameter("editar")!= null){
                 
                 direccion = "index.jsp";
             }else if (request.getParameter("confirmar")!= null){
                 direccion = "confirmacion.jsp";
             }else if(request.getParameter("inicio")!= null){
                
                 direccion = "index.jsp";
             }
             else{
                 
                 direccion = "resultados.jsp";
             }
            
           RequestDispatcher despachador = request.getRequestDispatcher(direccion);
           despachador.forward(request, response);
        } catch(Exception e){
                System.out.println(e);
        }
}
}
    

