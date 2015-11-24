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
            <h1 class="page-header">${title}</h1>

            <div class="row placeholders">
                <div class="col-md-12 col-sm-12 pager">
                    <div class="row">

                        <form role="form" id="schoolAdd" method="post" modelAtribute="schoolmodel">
                            <div class="form-horizontal" role="form">
                                <label for="titleforschool" class="col-sm-2 control-label">Titulo da Escola</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <input name="title" type="text" class="form-control" id="titleforschool"
                                           placeholder="Digite o titulo da Escola" value="${school.title}" required>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="cityforschool" class="col-sm-2 control-label">Cidade</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <select name="city" class="form-control" id="cityforschool" required>
                                        <option value="${school.city}">${school.city}</option>
                                        <c:forEach var="item" items="${cities}">
                                            <option value="${item}">${item.valor}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="stateforschool" class="col-sm-2 control-label">Estado</label>

                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <select name="state" class="form-control" id="stateforschool" required>
                                        <option value="${school.state}">${school.state}</option>
                                        <c:forEach var="item" items="${states}">
                                            <option value="${item}">${item.valor}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-info">Salvar</button>

                            <a class="btn btn-info" href="${pageContext.request.contextPath}/school">Voltar</a>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
