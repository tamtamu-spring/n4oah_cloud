'use strict'

$(function() {
	$('.signup-form-btn').click(function(event) {
		location.href = '/account/signupForm';
		event.preventDefault();
	});
	
	$('.signin-form-btn').click(function(event) {
		location.href = '/account/signinForm';
		event.preventDefault();
	});
	
	$('.signout-btn').click(function(event) {
		location.href = '/account/signout';
		event.preventDefault();
	});
});