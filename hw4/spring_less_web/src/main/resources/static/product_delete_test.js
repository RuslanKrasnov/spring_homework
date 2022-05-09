angular.module('app2', []).controller('indexProductController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/app';

    $scope.loadProducts = function () {
        $http.get(contextPath + '/product/all')
            .then(function (response) {
                $scope.productList = response.data;
            });
    };

    $scope.deleteProduct = function (prodId){
            $http({
                url: contextPath + '/product/delete',
                method: 'DELETE',
                params: {
                    prodId: prodId
                }
            }).then(function (response){
                $scope.loadProducts();
            });
    };

    $scope.loadProducts();

});