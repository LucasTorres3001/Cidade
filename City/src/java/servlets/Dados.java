package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Dados", urlPatterns = {"/Dados"})
public class Dados extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String populacao_txt,densidade_txt,pibpercapita_txt,idh_txt,gini_txt;
        
        populacao_txt = request.getParameter("populacao");
        densidade_txt = request.getParameter("densidade");
        pibpercapita_txt = request.getParameter("pibpercapita");
        idh_txt = request.getParameter("idh");
        gini_txt = request.getParameter("gini");
        
        request.setAttribute("populacao_txt", populacao_txt);
        request.setAttribute("densidade_txt", densidade_txt);
        request.setAttribute("pibpercapita_txt", pibpercapita_txt);
        request.setAttribute("idh_txt", idh_txt);
        request.setAttribute("gini_txt", gini_txt);
        
        request.getRequestDispatcher("Pagina.jsp").forward(request, response);
    }
}
