<%-- 
    Document   : jocs
    Created on : 30 abr 2024, 22:01:56
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
        <title>jocs</title>
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
                    <h1><spring:message code="gameCollection"/></h1>
                    <div class="mb-2">
                        <a href="<spring:url value='/jocs/add'/>" class="btn btn-primary btn-white">
                            <i class="fas fa-gamepad"></i><spring:message code="addJoc"/>
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
        <section class="container">
            <div class="row">
                <c:forEach items="${jocs}" var="joc">
                    <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                        <div class="thumbnail">
                            <div class="caption">
                                <h3>${joc.name}</h3>
                                <p>${joc.description}</p>
                                <p><b><spring:message code="price"/>:</b> ${joc.price} €</p>
                                <p>
                                    <a href=" <spring:url value= "/jocs/joc?codi=${joc.jocId}" /> " class="btn btn-primary">
                                        <span class="glyphicon-info-sign glyphicon"/></span><spring:message code="moreInfo"/>
                                    </a>
                                </p>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>
    </body>
</html>

