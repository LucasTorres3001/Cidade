<%@page import="classes.Info"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table,th,td{
                border: 1px solid #aaa;
                border-radius: 8px;
            }
            th,td{
                padding: 8px;
            }
        </style>
    </head>
    <body>
        <section>
            <a href="index.jsp" target="_self" title="Voltar"><input type="submit" name="volta" id="voltar" value="Voltar"></a>
             <%
                 try{
                     
                     String a, b, c;

                    a = request.getAttribute("populacao_txt").toString();
                    b = request.getAttribute("densidade_txt").toString();
                    c = request.getAttribute("pibpercapita_txt").toString();

                    long Populacao;
                    double Densidade,PIBperCapita;
                    String IDH,Gini;

                    Densidade = Double.parseDouble(b);
                    Gini = request.getAttribute("gini_txt").toString();
                    IDH = request.getAttribute("idh_txt").toString();
                    PIBperCapita = Double.parseDouble(c);
                    Populacao = Long.parseLong(a);
                    
                    Info pais = new Info();
                    
                    pais.setPopulacao(Populacao);
                    pais.setDensidade(Densidade);
                    pais.setGini(Gini);
                    pais.setIDH(IDH);
                    pais.setPIBperCapita(PIBperCapita);
                    
                    out.print(pais.tabDados());
                    out.print(pais.cultura());
                    out.print(pais.educacao());
                    out.print(pais.saude());
                    out.print(pais.transportes());
                    out.print(pais.esportes());
                    out.print(pais.subdivisoes());
                 }
                 catch(Exception e){
                     out.print("<h2>Error ;( ... " + e.getMessage() + "</h2>");
                 }
             %>
        </section>
    </body>
</html>
