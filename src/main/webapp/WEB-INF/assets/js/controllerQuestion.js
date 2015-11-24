/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function MyCtrl($scope) {

    var url = "/assets/img/bancoImg/";
    var type = ".png";
    var emptyImg = "sem-imagem.jpg";


    function loadImageA(imageA) {
        $scope.url_imageA = url + imageA + type;
            $scope.$digest()
        }

    function noloadA() {
        $scope.url_imageA = url + imageA + type;
        $scope.$digest()
    }

    $scope.showImageA = function(imageA) {
        if (imageA !== null) {
            setTimeout(loadImageA(imageA), 0)
        } else {
            setTimeout(noloadA, 0)
        }
    }
}

