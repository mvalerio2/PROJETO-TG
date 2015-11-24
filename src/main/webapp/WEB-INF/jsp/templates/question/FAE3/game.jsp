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

<div class="panel-body">
    <div class="row placeholders">
        <div class="col-md-12 col-sm-12 pager">
            <h3>${game.question.asking}</h3>
        </div>
    </div>
            <form role="form" id="addGame" method="post" modelAtribute="modelgame" class="centralizado" >
                <div class="col-md-9 col-sm-9 col-xs-9 centralizado">
                    <div ng-app class="center-block col-md-12 col-sm-12 col-xs-12 centralizado">
                        <div class="row placeholders center-block" style="margin-top: 30px" >
                            <div class="col-lg-8 col-md-10 col-sm-10 col-xs-12 row centralizado">
                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-8 placeholder " >
                                    <img class="img-responsive img-rounded centralizado" src="${pageContext.request.contextPath}/assets/img/bancoImg/${game.answerA.picture}.png"  style="background-color: #FFFFFF; width: 200px; height: 200px;"/>
                                    <button  style="width: 100%;" type="button" class="btn btn-lg btn-info" onclick="audioA.play();">
                                        <img style="width: 30px; height: 30px; alignment-adjust: middle" src="${pageContext.request.contextPath}/assets/img/menu/audio.png" />
                                    </button>
                                    <input id="ckbox1" type="checkbox" class="form-control form-horizontal" style="width: 100%;" onclick="checkbox1Validade()" ng-model="responseA"/>
                                </div>
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-8 placeholder " >
                                            <img class="img-responsive img-rounded centralizado" src="${pageContext.request.contextPath}/assets/img/bancoImg/${game.answerB.picture}.png"  style="background-color: #FFFFFF; width: 200px; height: 200px;"/>
                                            <button  style="width: 100%;" type="button" class="btn btn-lg btn-info" onclick="audioB.play();" >
                                                <img style="width: 30px; height: 30px; alignment-adjust: middle" src="${pageContext.request.contextPath}/assets/img/menu/audio.png" />
                                    </button>
                                    <input id="ckbox2" type="checkbox" class="form-control form-horizontal" style="width: 100%;" onclick="checkbox2Validade()" ng-model="responseB" />                        </div>
                            </div>
                        </div>
                        <div>
                            <input type="hidden" name="responseA" value="{{responseA}}">
                            <input type="hidden" name="responseB" value="{{responseB}}">
                            <div style="display: none">
                                <audio id="audioA" controls src="${pageContext.request.contextPath}/assets/audio/${game.answerA.audio}.ogg" type="audio/ogg"/>
                            </div>
                            <div style="display: none">
                                <audio id="audioB" controls src="${pageContext.request.contextPath}/assets/audio/${game.answerB.audio}.ogg" type="audio/ogg"/>
                            </div>
                        </div>
                    </div>
                </div>
        <div class="col-md-6 col-sm-12 col-xs-12  col-md-offset-1 centralizado">
            <div class=" col-md-12 col-sm-12 col-xs-12 centralizado" style="margin-top: 50px">
                <div class="form-group centralizado">
                    <div class="col-xs-4">
                        <a href="${pageContext.request.contextPath}/game/back" type="button" class="btn btn-lg btn-danger marginbutton"  >SAIR</a>
                    </div>
                    <div class="col-xs-4">
                        <a href="${pageContext.request.contextPath}/game/gap" type="button" class="btn btn-lg btn-warning  marginbutton" >PULAR</a>
                    </div>
                    <div class="col-xs-4">
                        <button type="submit" class="btn btn-lg btn-success marginbutton" >PRÓXIMA</button>
                    </div>
                </div>
            </div>

        </div>
    </form>
</div>

