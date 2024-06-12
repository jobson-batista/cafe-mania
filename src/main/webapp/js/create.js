/**
 * 
 */

function validate() {
	
	if(document.getElementById('name').value === null 
		|| document.getElementById('name').value === "" 
		|| document.getElementById('description').value === null 
		|| document.getElementById('description').value === "" 
		|| document.getElementById('price').value === null
		|| document.getElementById('price').value === ""
		|| document.getElementById('roast').value === null
		|| document.getElementById('roast').value === "Selecione..."
		|| document.getElementById('roast').value === ""
		|| document.getElementById('weight').value === null
		|| document.getElementById('weight').value === "Selecione..."
		|| document.getElementById('weight').value === ""
		|| document.getElementById('type').value === null
		|| document.getElementById('type').value === "Selecione..."
		|| document.getElementById('type').value === "") {
			showToast('alert','Algum campo está vazio!');
	} else {
		showToast('confirm','Café cadastrado com sucesso!');
		document.forms["formCreate"].submit();
	}
	
}

function showToast(type, msg) {
	let myAlert = document.querySelector('.toast');
	let bsAlert = new bootstrap.Toast(myAlert);
	let divToast = document.getElementsByClassName('toast')[0];
	document.getElementsByClassName('toast-body')[0].textContent = msg;

	if(type === 'confirm') {
		divToast.style.backgroundColor = "#00534e";
	} else if(type === 'alert') {
		divToast.style.backgroundColor = "#eead2d";
	}
	bsAlert.show();
	setTimeout(() => {
		bsAlert.hide();
	}, 5000);
	
}
