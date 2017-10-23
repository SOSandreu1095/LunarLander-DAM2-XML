/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import generated.Configuraciones;
import generated.Configuraciones.Configuracion;
import generated.ObjectFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 *
 * @author admin
 */
public class getFileExc extends HttpServlet {

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
        //Set new File object
        ServletContext context = getServletContext();
        String fullPath = context.getRealPath("/data/config.xml");
        File f = new File(fullPath);

        //parse xml to object (Personas, previusly created with JAXB)
        ObjectFactory jaxb = new ObjectFactory();
        Configuraciones cnfs = jaxb.xmlToObject(f);  //En aquest punt podem modificar prs, es un objecte.
        //marshall object to string xml
        StringWriter sw = new StringWriter();
        JAXB.marshal(cnfs, sw);
        String xmlString = sw.toString();
        //return XML
        response.setContentType("text/xml");
        PrintWriter pw = response.getWriter();
        pw.println(xmlString);
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
        //processRequest(request, response);

        try {
            String nombre = request.getParameter("nombre");
            String dif = request.getParameter("dificultad");
            String nav = request.getParameter("modeloNave");
            String lun = request.getParameter("modeloLuna");

            ServletContext context = getServletContext();
            String fullPath = context.getRealPath("/data/config.xml");
            File f = new File(fullPath);

//parsear el fichero (pasarlo a lista de Animales)
            ObjectFactory jaxb = new ObjectFactory();
            Configuraciones cnfs = jaxb.xmlToObject(f);


            Configuracion c = new Configuracion();
            c.setNombre(nombre);
            c.setDificultad(dif);
            c.setModeloNave(nav);
            c.setModeloLuna(lun);
            
            cnfs.getConfiguracion().add(c); //PETA AQUI, null pointer exception
            jaxb.objectToXml(cnfs, f);

            response.setContentType("application/json"); 
            PrintWriter pw = response.getWriter();
            pw.println("{\"mess\":\"Se ha guardado correctamente\"}");

        } catch (Exception e) {
            System.out.println("ERROR: "+e.toString());
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.setContentType("application/json");
            PrintWriter pw = response.getWriter();
            pw.println("{\"error\":\"Ha sido imposible guardar los datos\"}");

        }
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
