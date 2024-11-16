<%-- 
    Document   : joc
    Created on : 30 abr 2024, 22:01:47
    Author     : CarlosOO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="ca">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <title>joc</title>
        <style>
            .btn-white {
                background-color: #ffffff;
                color: #000000;
            }
            .language-links a {
                color: blue;
                margin-right: 10px;
            }
            .separator {
                margin-right: 10px;
            }
        </style>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Joc</h1>
                    <div class="mb-2">
                        <a href="<spring:url value="/jocs/all"/>" class="btn btn-primary btn-white">
                            <i class="fas fa-gamepad"></i> Veure la col·lecció
                        </a>
                    </div>
                </div>
            </div>
        </section>
        <section class="container">
            <div class="row">

                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>${joc.name}</h3>
                            <p>${joc.description}</p>
                            <p><b>Identificador:</b> ${joc.jocId}</p>
                            <p><b>Creat per:</b> ${joc.creator}</p>
                            <p><b>Categoria:</b> ${joc.category}</p>
                            <p><b>Preu:</b> ${joc.price} €</p>
                        </div>
                    </div>
                </div>

            </div>
        </section>
    </body>
</html>
