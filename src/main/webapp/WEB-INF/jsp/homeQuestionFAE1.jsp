<%--
  Created by IntelliJ IDEA.
  User: Marcus
  Date: 10/11/15
  Time: 01:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="" version="2.0">
    <title>Dystool</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/vendor/bootstrap/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/game.css"/>
    <!--<link href="/WEB-INF/pages/boostrap/css/game.css" rel="stylesheet" type="text/css" media="screen" />-->

    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>
<body>
    <jsp:include page="templates/others/message.jsp"/>

    <jsp:include page="templates/layout/headeradmin.jsp"/>

    <jsp:include page="templates/question/FAE1/list.jsp"/>

    <jsp:include page="templates/layout/footer.jsp"/>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="${pageContext.request.contextPath}/assets/js/vendor/bootstrap/bootstrap.min.js"></script>

<script src="${pageContext.request.contextPath}/assets/js/vendor/angularjs/angular.min.js"></script>

</body>
</html>
