<%-- 
    Document   : view
    Created on : 10/11/2015, 11:50:25
    Author     : Marcus
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="container-fluid panel-body">
    <div class="row">
        <div class="col-md-8 col-sm-8 col-md-offset-2 col-sm-offset-2 main">
            <h1 class="page-header">${title}</h1>

            <div class="row placeholders">
                <div class="col-md-12 col-sm-12 pager">
                    <div class="row">
                        <table class="table table-bordered">
                            <tr class="success">
                                <td>Nome</td>
                                <td class="text-center">${player.name}</td>
                            </tr>
                            <tr class="active">
                                <td>Data de Nascimento</td>
                                <fmt:formatDate value="${player.dateOfBirth}" pattern="dd/MM/yyyy" var="dateofbirth" />
                                <td class="text-center">${dateofbirth}</td>
                            </tr>
                            <tr class="active">
                                <td>Sexo</td>
                                <td class="text-center">${player.gender.valor}</td>
                            </tr>
                        </table>


                        <table class="table table-bordered">
                            <thead>
                                <tr class="success">
                                    <td class="text-center">Escola</td>
                                    <td class="text-center">Ano</td>
                                    <td class="text-center">Classe</td>
                                    <td class="text-center">Ação</td>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="item" items="${player.listSchool}" >
                                    <c:if test="${!empty item}">
                                        <tr class="active">
                                            <td class="text-center">${item.fkSchool.title}</td>
                                            <td class="text-center">${item.yearClasse}</td>
                                            <td class="text-center">${item.classe}</td>
                                            <td class="text-center">
                                                <a class="btn btn-warning" href="${pageContext.request.contextPath}/playerschool/edit${item.id}">Editar</a>
                                                <a class="btn btn-danger" href="${pageContext.request.contextPath}/playerschool/delete${item.id}">Remover</a>
                                            </td>
                                        </tr>
                                    </c:if>
                                </c:forEach>
                            </tbody>
                        </table>
                        <table class="table table-bordered">
                            <thead>
                                <tr class="success">
                                    <td class="text-center">Habilidade</td>
                                    <td class="text-center">level</td>
                                    <td class="text-center">Data da criação</td>
                                    <td class="text-center">Ação</td>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="item" items="${player.listStandart}" >
                                    <c:if test="${!empty item}">
                                        <tr class="active">
                                            <td class="text-center">${item.hability.valor}</td>
                                            <td class="text-center">${item.difficulty}</td>
                                            <fmt:formatDate value="${item.creationDate}" pattern="dd/MM/yyyy" var="date" />
                                            <td class="text-center">${date}</td>
                                            <td class="text-center">
                                                <a class="btn btn-warning" href="${pageContext.request.contextPath}/standart/edit${item.id}">Editar</a>
                                                <a class="btn btn-danger" href="${pageContext.request.contextPath}/standart/delete${item.id}">Remover</a>
                                            </td>
                                        </tr>
                                    </c:if>
                                </c:forEach>
                            </tbody>
                        </table>
                        <a class="btn btn-info" href="${pageContext.request.contextPath}/player">Voltar</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

