angular.module("appCadastro",[]);

angular.module("appCadastro").controller("appCadastroCtrl", function($scope, $http){

	urlCadastro = 'http://localhost:8080/ProjetoControleDeAnimes/rest/cadastro';
	
	console.log("entrou fora");
	
	 $scope.listarUsuarios = function () {
	 	console.log("entrou");
	     $http.get(urlCadastro).then(successCallback, errorCallback);
	 
	     function successCallback(response){
	         $scope.usuarios = response.data;
	        console.log("entrou");
	     }
	     function errorCallback(error){
	         alert("erro no get");
	     }
	 }
	
	
	
	$scope.selecionaUsuario = function(usuarioSelecionado) {
		$scope.usuario = usuarioSelecionado;
	}

	$scope.limparCampos = function() {
		$scope.usuario = "";
	}
	
	
	$scope.salvar = function(usuario){
		console.log(usuario.nome);
		 $http.post(urlCadastro, usuario).then(function (response){
	    	
			 delete $scope.usuario;
		    	listarUsuarios();
	     });
	}
	
	$scope.listarUsuarios();

});
