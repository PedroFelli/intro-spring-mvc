<%--
  Created by IntelliJ IDEA.
  User: pedro.amaral
  Date: 02/10/2017
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cadastro de Usuário</title>
</head>
<body>
    <div class="container">
        <h1>Cadastro de Usuários</h1>
        <hr>
        <div>
            <a class="btn btn-default" hreaf="#">Home</a>
    </div>
    <hr>
        <div>
            <spring:url value="${usuario.id == null ? '/usuario/save' : '/usuario/update'}" var="save"/>
            <form:form modelAttribute="usuario" action="${save }" method="post">
                <form:hidden path="id"/>
                <div class="form-group">
                    <label for="nome">Nome: </label>
                    <form:input path="nome" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="sobrenome">Sobrenome: </label>
                    <form:input path="sobrenome"  class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="dtNascimento">Data Nascimento: </label>
                    <form:input path="dtNascimento"  class="form-control" type="date"/>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Confirmar</button>
                </div>
            </form:form>
        </div>
    <footer class="footer">
        <p>&copy 2017 Pl Softwares</p>
    </footer>
    <hr>
    </div>
</body>
</html>
