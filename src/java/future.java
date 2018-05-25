/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author priya_000
 */
@WebServlet(urlPatterns = {"/future"})
public class future extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet future</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
           
            String name=request.getParameter("name");
            String dob=request.getParameter("dob");
            
            String x= dob.replace("-","0");
            
            out.println("<h2>Hello! " +name+ "</h2>");
             
          //  int num=Integer.parseInt(x);
                           
            int n=0;
           // int res1=0;
            
            for(int i=0;i<x.length();i++)
            {
                n+=Integer.parseInt(x.charAt(i)+"");
            }
                
            while(n>9)
            {
                n=n/10 + n%10;
                
            }
          /*  while(num!=0)
            {
               int y=num%10;
               num=num/10;
               res+=y;
            }
        
            if(res>9)
            {
                while(res!=0)
                {
                    int y=res%10;
                    res=res/10;
                    res1+=y;
                }
            }*/
            out.println("YOUR LUCKY NUMBER IS: "+n);
            
            String future="";
            
            switch(n)
            {
                case 1:
                        future="a";
                        break;
                    
                case 2:
                       future="b";
                        break;
                    
                case 3:
                        future="c";
                        break;
                
                case 4:
                        future="d";
                        break;
                    
                case 5:
                       future="e";
                        break;
                    
                case 6:
                        future="f";
                        break;
                    
                case 7:
                       future="g";
                        break;
                
                case 8:
                       future="h";
                        break;
                    
                case 9:
                       future="i";
                        break;
                    
                default:
                        future="j";
                    
            }
            
            out.println("your future is " +future);
            out.println("</body>");
            out.println("</html>");
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
