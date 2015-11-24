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
        <div class="col-md-8 col-sm-8 col-xs-8 col-md-offset-2 centralizado main">
            <h2>Biblioteca de Imagem</h2><br/>
            <div class="row">
            <c:forEach var="item" items="${list}" >
                <c:if test="${!empty item}">
                    <div class="col-md-4 col-xs-8 placeholder">
                        <img class="img-responsive img-rounded imagembk centralizado" src="${pageContext.request.contextPath}/assets/img/bancoImg/${item}.png"  />
                        <h4 class="text-center">${item}</h4>
                        </div>
                    </c:if>
                </c:forEach>

            </div>
        </div>
    </div>
</div>

