'use strict';

var module = angular.module('demo.controllers', []);
module.controller("UserController", [ "$scope", "UserService",
		function($scope, UserService) {

			$scope.userDto = {
				id : null,
				login : null,
				email : null
			};

			$scope.emailPattern = "/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/";

			$scope.saveUser = function() {

				UserService.saveUser($scope.userDto).then(function() {
					console.log("works");
					UserService.getAllUsers().then(function(value) {
						$scope.allUsers= value.data;
					}, function(reason) {
						console.log("error occured");
					}, function(value) {
						console.log("no callback");
					});

					$scope.userDto = {
						id : null,
						login : null,
						email : null
					};
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);