app.controller('users', function($scope, $http) {
        $http.get('/users/').success(function(data) {
            $scope.headingTitle = "User List";
            $scope.users = data;
        })
});

app.controller('roles', function($scope, $http) {
    $http.get('/roles/').success(function(data) {
        $scope.headingTitle = "Roles List";
        $scope.roles = data;
    })
});


app.controller('home', function($scope, $http) {
    $http.get('/').success(function(data) {
        $scope.headingTitle = "Roles List";
        $scope.greeting = data;
    })
});
