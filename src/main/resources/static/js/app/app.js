'use strict'

var demoApp = angular.module('demo', [ 'ui.bootstrap', 'demo.controllers',
		'demo.services' ]);
demoApp.constant("CONSTANTS", {
	getUserUrl : "/user/getUser/",
	getAllUsers : "/users",
	saveUser : "/user"
});