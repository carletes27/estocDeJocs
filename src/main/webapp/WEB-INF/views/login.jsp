<%-- 
    Document   : login
    Created on : 30 abr 2024, 22:02:05
    Author     : CarlosOO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <title>Jocs</title>
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
                    <h1><spring:message code="authentication"/></h1>
                    <div class="mb-2">
                        <a href="<spring:url value="/jocs/all"/>" class="btn btn-primary btn-white">
                            <i class="fas fa-gamepad"></i><spring:message code="viewCollection"/>
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
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title"><spring:message code="pleaseProvide"/></h3>
                        </div>
                        <div class="panel-body">
                            <c:if test="${not empty error}">
                                <div class="alert alert-danger">
                                    <spring:message code="incorrectCredentials"/>
                                </div>
                            </c:if>
                            <form action="<c:url value= "/j_spring_security_check"> </c:url>" method="post">
                                <fieldset>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="Usuari" name='j_username' type="text">
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="Contrasenya" name='j_password' type="password">
                                    </div>
                                    <input class="btn btn-lg btn-success btn-block" type="submit" value="Connectar">
                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
