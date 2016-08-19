angular.module('empApp',[]).controller('empController',['$scope', '$http', function($scope, $http){
//var restURL = 'http://localhost:8080/JAXRSWebServiceTestProj-0.0.1-SNAPSHOT/rest/factorialService/factorial?inputValue=';	
var restURL = 'http://localhost:8080/CXFRestServiceProj/rest/employeeService/getemployeedetail?employeeI='
$scope.isEmp = false;
$scope.getEmp = function(){
$http.get(restURL.concat($scope.empID)).then(function(response){
$scope.employees = response.data;
$scope.isEmp = false;
},function(error){$scope.isEmp = true;})};
}]);

