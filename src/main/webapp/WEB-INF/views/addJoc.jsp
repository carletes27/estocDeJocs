<%-- 
    Document   : afegirJoc
    Created on : 30 abr 2024, 22:01:34
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
                    <h1><spring:message code="addJoc.title"/></h1>
                    <div class="mb-2">
                        <a href="<spring:url value="/jocs/all"/>" class="btn btn-primary btn-white">
                            <i class="fas fa-gamepad"></i> <spring:message code="viewCollection"/>
                        </a>
                    </div>
                    <div class="mb-2">
                        <a href="<c:url value="/j_spring_security_logout" />" class="btn btn-primary btn-white">
                            <i class="fas fa-power-off"></i> <spring:message code="logOut"/>
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
            <form:form modelAttribute="newJoc" class="form-horizontal">
                <fieldset>
                    <legend><spring:message code="addJoc.title"/></legend>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="jocId">
                            <spring:message code="addJoc.form.jocId.label"/>
                        </label>
                        <div class="col-lg-10">
                            <form:input id="jocId" path="jocId" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="name">
                            <spring:message code="addJoc.form.name.label"/>
                        </label>
                        <div class="col-lg-10">
                            <form:input id="name" path="name" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="price">
                            <spring:message code="addJoc.form.price.label"/>
                        </label>
                        <div class="col-lg-10">
                            <form:input id="price" path="price" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="creator">
                            <spring:message code="addJoc.form.creator.label"/>
                        </label>
                        <div class="col-lg-10">
                            <form:input id="creator" path="creator" type="text" class="form:input-large"/>
                        </div>
                    </div>   
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="category">
                            <spring:message code="addJoc.form.category.label"/>
                        </label>
                        <div class="col-lg-10">
                            <form:input id="category" path="category" type="text" class="form:input-large"/>
                        </div>
                    </div> 
                                         
                    <div class="form-group">
                        <label class="control-label col-lg-2"
                               for="description"><spring:message code="addJoc.form.description.label"/></label>
                        <div class="col-lg-10">
                            <form:textarea id="description" path="description" rows ="2"/>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <div class="col-lg-offset-2 col-lg-10">
                            <input type="submit" id="btnAdd" class="btn btn-primary"
                                   value ="<spring:message code='addJoc.button'/>"/>
                        </div>
                    </div>
                </fieldset>
            </form:form>
        </section>
    </body>
</html>
