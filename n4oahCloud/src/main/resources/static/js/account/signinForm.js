'use strict'

$(function() {
	$('#auto-signin').change(function(event) {
		if($('#auto-signin').is(':checked') == true) {
			$('#id-save').prop('checked', true);
			$('#id-save').attr('disabled', 'disabled');
		} if($('#auto-signin').is(':checked') == false) {
			$('#id-save').prop('checked', false);
			$('#id-save').removeAttr('disabled');
		}
		event.preventDefault();
	});
	
	#('#login-form').submit(function(event) {
		
		event.preventDefault();
	});
});