package com.fannie;

public class script {

	public static void main(String ... args) {
		System.out.println("Hello");
	}


	function show(element) {
		element.style.display = 'inline';
	}

	function hide(element) {
		element.style.display = 'none';
	}

	function checkForm() {
		var specialChars = "*|,\":<>[]{}`\';()&$#%";
		var  requireUsername = document.getElementById('requireUsername'),
				requirePassword = document.getElementById('requirePassword'),
				invalidUsernamePassword = document.getElementById('invalidUsernamePassword');

		var failed = false;

		if(document.forms[0].username.value == "") {
			show(requireUsername);
			hide(invalidUsernamePassword);
			failed = true;
		} else {
			hide(requireUsername);
			if(document.forms[0].username.value.length > 50 || document.forms[0].username.value.length < 3 ){
				show(invalidUsernamePassword);
				failed = true;
			}else{
				hide(invalidUsernamePassword);
			}
		}

		if(document.forms[0].password.value == "") {
			show(requirePassword);
			hide(invalidUsernamePassword);
			failed = true;
		} else {
			hide(requirePassword);
			if(failed == true || document.forms[0].password.value.length > 128){
				show(invalidUsernamePassword);
				failed = true;
			}else {
				hide(invalidUsernamePassword);
			}
		}

		return !failed;
	}

	function clear() {
		document.getElementById('username').value = '';
		document.getElementById('password').value = '';
	}


}
