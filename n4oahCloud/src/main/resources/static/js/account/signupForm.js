'use strict'

$(function() {
	$('#signup-form').submit(function(event) {
		if (!($('#pwd1').val() === $('#pwd2').val())) {
			alert('비밀번호가 서로 일치하지 않습니다.');
			event.preventDefault();
		}
	});
});