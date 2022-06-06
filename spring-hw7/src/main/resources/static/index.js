angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/app';

    $scope.loadProducts = function () {
        $http.get(contextPath + '/products')
            .then(function (response) {
                $scope.ProdBetweenList = response.data;
            });
    };

    $scope.findByCostBetween = function (min, max) {
        $http({
            url: contextPath + '/products/cost_between',
            method: 'GET',
            params: {
                min: $scope.findByCostBetween.min,
                max: $scope.findByCostBetween.max
            }
        }).then(function (response) {
            $scope.ProdBetweenList = response.data;
        });
    };

    $scope.loadProducts();
});