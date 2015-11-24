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
                                <td class="text-center" >${player.name}</td>
                            </tr>
                            <tr class="active">
                                <td>Data de Nascimento</td>
                                <fmt:formatDate value="${player.dateOfBirth}" pattern="dd/MM/yyyy" var="dateOfBirth"/>
                                <td class="text-center" >${dateOfBirth}</td>
                            </tr>
                            <tr class="active">
                                <td>Sexo</td>
                                <td class="text-center" >${player.gender.valor}</td>
                            </tr>
                        </table>


                        <table class="table table-bordered">
                            <thead>
                                <tr class="success">
                                    <td>Escola</td>
                                    <td class="text-center" >Ano</td>
                                    <td class="text-center" >Classe</td>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="item" items="${player.listSchool}" >
                                    <c:if test="${!empty item}">
                                        <tr class="active">
                                            <td>${item.fkSchool.title}</td>
                                            <td class="text-center" >${item.yearClasse}</td>
                                            <td class="text-center">${item.classe}</td>
                                        </tr>
                                    </c:if>
                                </c:forEach>
                            </tbody>
                        </table>
                        <table class="table table-bordered">
                            <thead>
                                <tr class="success">
                                    <td>Habilidade</td>
                                    <td class="text-center">level</td>
                                    <td class="text-center">Data da criação</td>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="item" items="${player.listStandart}" >
                                    <c:if test="${!empty item}">
                                        <tr class="active">
                                            <td>${item.hability.valor}</td>
                                            <td class="text-center">${item.difficulty}</td>
                                            <fmt:formatDate value="${item.creationDate}" pattern="dd/MM/yyyy" var="creationDate"/>
                                            <td class="text-center">${creationDate}</td>
                                        </tr>
                                    </c:if>
                                </c:forEach>
                            </tbody>
                        </table>
                        <table class="table table-bordered">
                            <thead>
                                <tr class="success">
                                    <td>Habilidate</td>
                                    <td class="text-center">Porcentagem de Acertos</td>
                                    <td class="text-center">Quantidade Respondida</td>
                                </tr>
                            </thead>
                            <tbody>
                                <tr class="active">
                                    <td>${ALITERACAO}</td>
                                    <td class="text-center" ng-bind >${player_ALITERACAO}</td>
                                    <td class="text-center" ng-bind >${player_numb_ALITERACAO}</td>
                                </tr>
                                <tr class="active">
                                    <td>${RIMA}</td>
                                    <td class="text-center" >${player_RIMA}</td>
                                    <td class="text-center" >${player_numb_RIMA}</td>
                                </tr>
                                <tr class="active">
                                    <td>${SEGMENTACAOSILABICA}</td>
                                    <td class="text-center">${player_SEGMENTACAOSILABICA}</td>
                                    <td class="text-center">${player_numb_SEGMENTACAOSILABICA}</td>
                                </tr>
                                <tr class="active">
                                    <td>${DISCRIMINACAOFONEMICA}</td>
                                    <td class="text-center">${player_DISCRIMINACAOFONEMICA}</td>
                                    <td class="text-center">${player_numb_DISCRIMINACAOFONEMICA}</td>
                                </tr>
                                <tr class="active">
                                    <td>${MEMORIAFONOLOGICA}</td>
                                    <td class="text-center" >${player_MEMORIAFONOLOGICA}</td>
                                    <td class="text-center" >${player_numb_MEMORIAFONOLOGICA}</td>
                                </tr>
                                <tr class="active">
                                    <td>${REPETICAODEPSEUDOPALAVRAS}</td>
                                    <td class="text-center" >${player_REPETICAODEPSEUDOPALAVRAS}</td>
                                    <td class="text-center" >${player_numb_REPETICAODEPSEUDOPALAVRAS}</td>
                                </tr>
                                <tr class="active">
                                    <td>${COPIADEERITMO}</td>
                                    <td class="text-center">${player_COPIADEERITMO}</td>
                                    <td class="text-center">${player_numb_COPIADEERITMO}</td>
                                </tr>
                                <tr class="active">
                                    <td>${MEMORIAVISUAL}</td>
                                    <td class="text-center" >${player_MEMORIAVISUAL}</td>
                                    <td class="text-center" >${player_numb_MEMORIAVISUAL}</td>
                                </tr>
                                <tr class="active">
                                    <td>${COPIADEFORMAS}</td>
                                    <td class="text-center" >${player_COPIADEFORMAS}</td>
                                    <td class="text-center" >${player_numb_COPIADEFORMAS}</td>
                                </tr>
                            </tbody>
                        </table>
                                    <a class="btn btn-info" href="${pageContext.request.contextPath}/result">Voltar</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

