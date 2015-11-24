<%--
  Created by IntelliJ IDEA.
  User: Marcus
  Date: 10/11/15
  Time: 01:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="${pageContext.request.contextPath}/assets/js/vendor/angularjs/angular.min.js"></script>

<div class="panel-body centralizado">
    <div class="row placeholders" ng-init="show_message = false">
        <div class="col-md-12 col-sm-12  col-lg-12 col-xs-12 pager centralizado" style="vertical-align: middle">
            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-10 centralizado messageGame" >
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 centralizado" style="vertical-align: middle">
                    <h1>${resposta}</h1>
                    <h2>${resposta_texto}</h2>
                </div>
                <div class="col-lg-2 col-md-2 col-sm-3 col-xs-4 centralizado" style="margin-top: 5%; vertical-align: middle">
                    <img class="img-responsive" src="${pageContext.request.contextPath}/assets/img/emoticons/${resposta_imagem}.png"/>
                </div>
                <div class="col-lg-4 col-md-6 col-sm-6 col-xs-8 centralizado" style="margin-top: 5%; vertical-align: middle">
                    <a href="${pageContext.request.contextPath}/${url}" type="button" class="btn btn-lg btn-default  marginbutton" >OK</a>
                </div>
            </div>
        </div>
    </div>
</div>

