'use strict'

$(function() {
	$('#signup-form').submit(function(event) {
		let id = $('#id').val();
		
		$.ajax({
			url: '/account/idOverlapChk.do',
			data: {'id': id},
			method: 'get',
			async: false,
			success: function(overlap) {
				if (overlap == true) {
					alertify.alert("중복된 아이디 입니다.");
					event.preventDefault();
					console.log('aa');
					return false;
				}
			}
		});
			
		if (!($('#pwd1').val() === $('#pwd2').val())) {
			alert('비밀번호가 서로 일치하지 않습니다.');
			event.preventDefault();
		}
	});
});