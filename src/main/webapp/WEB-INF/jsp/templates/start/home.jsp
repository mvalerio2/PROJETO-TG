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
            <h1>${title}</h1>
            <p><h4>Escolha e click em um dos jogos para começar!</h4></p><br/>
        <div class="row">
                <c:forEach var="item" items="${listGames}" >
                    <c:if test="${!empty item}">
                        <div class="col-md-4 col-xs-4 placeholder">
                            <a href="${pageContext.request.contextPath}/game/start${item.id}" class="thumbnail" >
                                <img class="img-responsive tamanhofixo200" src="${pageContext.request.contextPath}/assets/img/num/${item.difficulty}.png"  style="width: 200px; height: 200px;"/>
                            </a>
                                <h4 class="text-center">${item.hability.valor}</h4>
                        </div>
                    </c:if>
                </c:forEach>

            </div>
        </div>
    </div>
</div>

