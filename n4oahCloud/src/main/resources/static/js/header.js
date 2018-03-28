'use strict'

$(function() {
	$('.signup-form-btn').click(function(event) {
		location.href = '/account/signupForm.do';
		event.preventDefault();
	});
	
	$('.signin-form-btn').click(function(event) {
		location.href = '/account/signinForm.do';
		event.preventDefault();
	});
	
	$('.signout-btn').click(function(event) {
		location.href = '/account/signout.do';
		event.preventDefault();
	});
});