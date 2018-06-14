'use strict'

$(function() {
	$('#signup-form').submit(function(event) {
		let id = $('#id').val(),
			email = $('#email').val();
		
		$.ajax({
			url: '/account/overlapChk',
			data: {'id': id, 'email': email},
			method: 'get',
			async: false,
			success: function(overlap) {
				if (overlap == 1) {
					alertify.alert("중복된 아이디 입니다.");
					event.preventDefault();
				} else if (overlap == 2) {
					alertify.alert("중복된 이메일 입니다.");
					event.preventDefault();
				}
			}
		});
			
		if (!($('#pwd1').val() === $('#pwd2').val())) {
			alert('비밀번호가 서로 일치하지 않습니다.');
			event.preventDefault();
		}
	});
});