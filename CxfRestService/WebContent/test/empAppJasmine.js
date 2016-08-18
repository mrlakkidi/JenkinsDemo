describe('Employee Rest Example', function () {

  beforeEach(module('empApp'));

  var $controller;
  var mockEmpList = [{"firstName":"Pete","lastName":"Smith","employeeId":"123456","email":"test@example.com","dateOfJoining":"01-02-2001","department":"Sales"}];
  beforeEach(inject(function(_$controller_, _$httpBackend_){
    $controller = _$controller_;
	$httpBackend = _$httpBackend_;
	$httpBackend.whenGET('http://localhost:8080/CXFRestServiceProj/rest/employeeService/getemployeedetail?employeeId=123456').respond(200, mockEmpList);
  }));

  describe('empApp module test', function () {
  it('says hello employees!', function () {
      var $scope = {};
      var controller = $controller('empController', { $scope: $scope });
	  $scope.empID = "123455";
	  $scope.getEmp();
	  $httpBackend.flush();
	  expect($scope.employees).not.toEqual(undefined);
    }); 
  });

});


 