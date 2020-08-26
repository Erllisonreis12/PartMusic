var nameInput = document.getElementById('validarNome');
var nameEmail = document.getElementById('validarEmail')
var senhaInput = document.getElementById('validarSenha');
var addDados = document.getElementById('entrar');

addButton.addEventListener('click', function(){
	create(nameInput.value,nameEmail.value,senhaInput.value)
});

function create(name,senha){
	var data = {
		name: name,
		email: email,
		senha: senha
	};
	return firebase.database().ref().child('users').push(data);
}

firebase.database().ref('users').on('value', function(snapshot){
	usersList.innerHTML = '';
	snapshot.forEach(function(item){
		var li = document.createElement('li');
		li.appendChild(document.createTextNode(item.val().name + ':'+ item.val().age));
		usersList.appendChild(li);
	});
});