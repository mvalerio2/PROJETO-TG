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
        <div class="col-md-2 col-sm-2" style="position:fixed">
            <jsp:include page="../others/menulateral.jsp"/>
        </div>
        <div class="col-md-8 col-sm-8 main centralizado">
            <h1 class="page-header">${title}</h1>
            <div class=" col-xs-12 row centralizado">
                <a class="btn btn-success" href="${pageContext.request.contextPath}/question/FAE1/add" style="width: 100%">Adicionar novo questão</a>

            </div>

            <div class=" col-xs-12 row centralizado" style="margin-top: 10px">
                <div class="table-responsive">
                    <table class="table table-bordered">
                        <thead>
                            <tr class="success">
                                <td class="text-center">Name</td>
                                <td class="text-center">Ação</td>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="item" items="${users}" >
                                <c:if test="${!empty item}">
                                    <tr class="active">
                                        <td class="text-center">${item.nameUser}</td>
                                        <td class="text-center">
                                            <a class="btn btn-warning" href="${pageContext.request.contextPath}/user/edit${item.id}">Editar</a>
                                            <a class="btn btn-danger" href="${pageContext.request.contextPath}/user/delete${item.id}">Remover</a>
                                        </td>
                                    </tr>
                                </c:if>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </div>
</div>

