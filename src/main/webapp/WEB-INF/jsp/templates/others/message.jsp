<%-- 
    Document   : message
    Created on : 04/10/2015, 22:47:00
    Author     : Marcus 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div ng-app>
    <div class="row" style="margin: 10px">
        <input type="hidden" ng-model="msgError" ng-init="msgError = '${messageError}'"/>
        <div ng-show="msgError" class="col-sm-8 col-xs-6 col-sm-offset-2 col-xs-4" style="padding-top: 30px">
            <div class="alert alert-danger alert-dismissible" role="alert" >
            <button type="button" class="close" data-dismiss="alert">
                <span aria-hidden="true">&times;</span>
                <span class="sr-only">Close</span>
            </button>
            <h4 class="text-center text-danger centralizado">{{msgError}}</h4>
        </div>
    </div>

    <input type="hidden" ng-model="msgSuccess" ng-init="msgSuccess = '${messageSuccess}'"/>
    <div ng-show="msgSuccess" class="col-sm-8 col-lg-offset-2" style="padding-top: 30px">
        <div class="alert alert-success alert-dismissible" role="alert" >
            <button type="button" class="close" data-dismiss="alert">
                <span aria-hidden="true">&times;</span>
                <span class="sr-only">Close</span>
            </button>
            <h4 class="text-center text-danger centralizado">{{msgSuccess}}</h4>
        </div>
    </div>
    </div>
</div>
