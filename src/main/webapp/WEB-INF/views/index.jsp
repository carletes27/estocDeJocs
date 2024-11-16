<%-- 
    Document   : welcome
    Created on : 30 abr 2024, 21:04:09
    Author     : CarlosOO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="ca">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <title>index</title>
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
                    <h1> ${benvinguda} </h1>
                    <p> ${tagline} </p>
                    <div class="mb-2">
                        <a href="<spring:url value="/jocs/all"/>" class="btn btn-primary btn-white">
                            <i class="fas fa-gamepad"></i><spring:message code="viewCollection"/>
                        </a>
                    </div>
                    <div class="mb-2">
                        <a href="<spring:url value='/login'/>" class="btn btn-primary btn-white">
                            <i class="fas fa-sign-in-alt"></i><spring:message code="authenticate"/>
                        </a>
                    </div>
                    <div class="language-links pull-right">
                        <a href="?language=ca">Català</a>
                         <span class="separator">|</span>
                        <a href="?language=en">Anglès</a>
                    </div>
                </div>
            </div>  
        </section>
    </body>
</html>
