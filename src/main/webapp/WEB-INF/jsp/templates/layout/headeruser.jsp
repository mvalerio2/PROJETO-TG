<%--
  Created by IntelliJ IDEA.
  User: Marcus
  Date: 10/11/15
  Time: 01:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" >Dystool</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}/game">Inicial</a></li>
                <li><a href="${pageContext.request.contextPath}/about">Sobre</a></li>
                <li><a href="${pageContext.request.contextPath}/developer">Desevolvedor</a></li>
            </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="${pageContext.request.contextPath}/">SAIR</a></li>
                </ul>
        </div>
    </div>
</div>
