<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <header>
            <h1>Programa</h1>
        </header>
        <section>
            <form action="Dados" method="POST" name="Form" id="Formulario">
                <fieldset>
                    <legend>Informações</legend>
                    <fieldset>
                        <legend>População</legend>
                        <p>
                            <label for="Population">População:</label>
                            <input type="text" name="populacao" id="Population" size="12" maxlength="8" placeholder="Digite a população" required="">
                        </p>
                    </fieldset>
                    <fieldset>
                        <legend>Densidade</legend>
                        <p>
                            <label for="Density">Densidade:</label>
                            <input type="text" name="densidade" id="Density" size="10" maxlength="7" placeholder="Densidade" required="">
                        </p>
                    </fieldset>
                    <fieldset>
                        <legend>PIB per capita</legend>
                        <p>
                            <label for="PIB">PIB per capita: R$</label>
                            <input type="text" name="pibpercapita" id="PIB" size="10" maxlength="8" placeholder="PIB per capita" required="">
                        </p>
                    </fieldset>
                    <fieldset>
                        <legend>Ínidice de Desenvolvimento Humano</legend>
                        <p>
                            <label for="idh">I.D.H.:</label>
                            <input type="text" name="idh" id="idh" size="6" maxlength="5" placeholder="IDH" required="">
                        </p>
                    </fieldset>
                    <fieldset>
                        <legend>Coeficiente de Gini</legend>
                        <p>
                            <label for="gini">Gini:</label>
                            <input type="text" name="gini" id="gini" size="5" maxlength="4" placeholder="Gini" required="">
                        </p>
                    </fieldset>
                </fieldset>
                <br/>
                <input type="submit" name="enviar" id="Enviar" value="Enviar">
            </form>
        </section>
    </body>
</html>
