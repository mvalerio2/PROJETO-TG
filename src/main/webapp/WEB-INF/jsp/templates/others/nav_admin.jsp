<%--
  Created by IntelliJ IDEA.
  User: Marcus
  Date: 10/11/15
  Time: 01:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container-fluid panel-body">
    <div class="row">
        <div class="col-md-8 col-sm-8 col-md-offset-2 col-sm-offset-2 main">
            <h1>Escolha o que deseja fazer</h1>
            <div class="row">
                <div class="col-xs-6 col-md-3 placeholder">
                    <a href="${pageContext.request.contextPath}/question" class="thumbnail" >
                        <img class="img-responsive tamanhofixo200" src="${pageContext.request.contextPath}/assets/img/menu/question.jpg"  style="width: 200px; height: 200px;"/>
                    </a>
                    <h4>Questões</h4>
                </div>

                <div class="col-xs-6 col-md-3">
                    <a href="${pageContext.request.contextPath}/school" class="thumbnail" >
                        <img class="img-responsive" src="${pageContext.request.contextPath}/assets/img/menu/escola.jpg" style="width: 200px; height: 200px;"/>
                    </a>
                    <h4>Escolas</h4>
                </div>

                <div class="col-xs-6 col-md-3">
                    <a href="${pageContext.request.contextPath}/player" class="thumbnail">
                        <img class="img-responsive" src="${pageContext.request.contextPath}/assets/img/menu/users.jpg"  style="width: 200px; height: 200px;">
                    </a>

                    <h4>Usuários</h4>
                </div>

                <div class="col-xs-6 col-md-3">
                    <a href="${pageContext.request.contextPath}/result" class="thumbnail">
                        <img class="img-responsive  " src="${pageContext.request.contextPath}/assets/img/menu/dados.jpg"  style="width: 200px; height: 200px;">
                    </a>

                    <h4>Resultados</h4>
                </div>
            </div>
        </div>
    </div>
</div>

