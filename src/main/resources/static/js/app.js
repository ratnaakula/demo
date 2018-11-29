var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/users',{
            templateUrl: '/views/users.html',
            controller: 'users'
        })
        .when('/roles',{
            templateUrl: '/views/roles.html',
            controller: 'roles'
        })
        .when('/userscrud',{
            templateUrl: '/views/userscrud.html',
            controller: 'userCrudController'
        })
        .otherwise(
            { redirectTo: '/home' }
        );
});

