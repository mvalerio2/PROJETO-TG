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

<div class="container-fluid panel-body">
    <div class="row">
        <div class="col-md-8 col-sm-8 col-md-offset-2 col-sm-offset-2 main">
            <h1 class="page-header">${title}</h1>

            <div class="row placeholders">
                <div class="col-md-12 col-sm-12 pager">
                    <div class="row">

                        <form role="form" id="questionadd" method="post" modelAtribute="quetionmodel">
                            <div class="form-horizontal" role="form">

                                <label for="hability" class="col-sm-2 control-label">Habilidade</label>
                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <select name="hability" class="form-control" id="hability" required>
                                        <option value="${question.hability}">${question.hability.valor}</option>
                                        <c:forEach var="item" items="${habilities}">
                                            <option value="${item}">${item.valor}</option>
                                        </c:forEach>
                                    </select>
                                </div>

                                        <label for="difficulty" class="col-sm-2 control-label">Nível de Dificuldade</label>
                                        <div class="col-sm-10" style="padding-bottom: 25px;">
                                            <input name="difficulty" type="number" class="form-control" id="difficulty" min="1" max="10"
                                                   placeholder="Entre que o nível da dificuldade" value="${question.difficulty}" required>
                                        </div>

                                <label for="asking" class="col-sm-2 control-label">Pergunta</label>
                                <div class="col-sm-10" style="padding-bottom: 25px;">
                                    <textarea name="asking" class="form-control" id="asking" maxlength="255"
                                              placeholder="Digite a questão" value="${question.asking}" required ></textarea>
                                </div>

                                <div ng-app>
                                    <div class="col-sm-12" style="padding-bottom: 25px;">
                                    <label for="pictureA" class="col-sm-2 control-label">Imagem da alternativa A</label>
                                    <div class="col-sm-4" >
                                        <input name="pictureA" type="text" class="form-control" id="pictureA"
                                               value="${question.pictureA}" ng-model="pictureloadA" required>
                                    </div>
                                    <label for="responseA" class="col-sm-2 control-label">Texto da alternativa A</label>
                                    <div class="col-sm-4" >
                                        <input name="responseA" type="text" class="form-control" id="responseA"
                                               value="${question.responseA}" required>
                                    </div>
                                    <div class="col-sm-4">
                                        <label>
                                            <input type="hidden" name="correctA" value="{{correctA}}">
                                            <input class="form-control" type="checkbox" id="isCorrectA"
                                                   ng-model="correctA">Marque se está correta
                                        </label>
                                    </div>
                                    </div>

                                <div class="col-sm-12" style="padding-bottom: 25px;">
                                    <div class="ng-binding" >
                                        <img class="img-responsive img-rounded center-block" src="${pageContext.request.contextPath}/assets/img/bancoImg/{{pictureloadA}}.png"  style="width: 200px; height: 200px;background-color: #FFFFFF"/>
                                    </div>
                                </div>

                                <div class="col-sm-12" style="padding-bottom: 25px;">
                                    <label for="pictureB" class="col-sm-2 control-label">Imagem da alternativa B</label>
                                    <div class="col-sm-4" >
                                        <input name="pictureB" type="text" class="form-control" id="pictureB"
                                               value="${question.pictureB}" ng-model="pictureloadB" required>
                                    </div>
                                    <label for="responseB" class="col-sm-2 control-label">Texto da alternativa B</label>
                                    <div class="col-sm-4" >
                                        <input name="responseB" type="text" class="form-control" id="responseB"
                                               value="${question.responseB}" required>
                                    </div>
                                    <div class="col-sm-4">
                                        <label>
                                            <input type="hidden" name="correctB" value="{{correctB}}">
                                            <input class="form-control" type="checkbox" id="isCorrectB"
                                                   ng-model="correctB">Marque se está correta
                                        </label>
                                    </div>
                                </div>

                                <div class="col-sm-12" style="padding-bottom: 25px;">
                                    <div class="ng-binding" >
                                        <img class="img-responsive img-rounded center-block" src="${pageContext.request.contextPath}/assets/img/bancoImg/{{pictureloadB}}.png"  style="width: 200px; height: 200px;background-color: #FFFFFF"/>
                                    </div>
                                </div>

                                <div class="col-sm-12" style="padding-bottom: 25px;">
                                    <label for="pictureC" class="col-sm-2 control-label">Imagem da alternativa C</label>
                                    <div class="col-sm-4" >
                                        <input name="pictureC" type="text" class="form-control" id="pictureC"
                                               value="${question.pictureC}" ng-model="pictureloadC" required>
                                    </div>
                                    <label for="responseC" class="col-sm-2 control-label">Texto da alternativa C</label>
                                    <div class="col-sm-4" >
                                        <input name="responseC" type="text" class="form-control" id="responseC"
                                               value="${question.responseC}" required >
                                    </div>
                                    <div class="col-sm-4">
                                        <label>
                                            <input type="hidden" name="correctC" value="{{correctC}}">
                                            <input class="form-control" type="checkbox" id="isCorrectC"
                                                   ng-model="correctC">Marque se está correta
                                        </label>
                                    </div>
                                </div>

                                <div class="col-sm-12" style="padding-bottom: 25px;">
                                    <div class="ng-binding" >
                                        <img class="img-responsive img-rounded center-block" src="${pageContext.request.contextPath}/assets/img/bancoImg/{{pictureloadC}}.png"  style="width: 200px; height: 200px;background-color: #FFFFFF"/>
                                    </div>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-info">Salvar</button>
                            <a class="btn btn-info" href="${pageContext.request.contextPath}/question/FAE4">Voltar</a>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

