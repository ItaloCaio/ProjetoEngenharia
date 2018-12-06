angular.module("appLogin",[]);

angular.module("appLogin").controller("appLoginCtrl", function($scope, $http){

	
	urlUsuario = 'http://localhost:8080/ProjetoControleDeAnimes/rest/login';

	$scope.listarUsuarios = function () {
	     $http.get(urlUsuario).then(successCallback, errorCallback);
	 
	     function successCallback(response){
	         $scope.usuarios = response.data;

	          var teste = function(usuario){
		        	$scope.usuario = usuario;
		        }
		        
		        
		      $scope.usuarios.forEach(teste) ;
		      console.log($scope.usuario);
	        
	     }
	     function errorCallback(error){
	         alert("erro no get");
	     }
	 }
	

	
	
	
	$scope.entrar = function(usuario){
		
		  $http.post(urlUsuario, usuario).then(function (response){
		    	$scope.usuario = response.data;
		    	
		    	console.log(usuario.senha);
//		    	 	
		    	if($scope.usuario.nome === undefined){
		    		alert("Email ou senha incorretos");
		    	}else{
		    		window.location.replace("http://localhost:8080/ProjetoControleDeAnimes");
		    		
		    	}
		    	

		    	$scope.listarUsuarios();
	     });
	
		
		
		
		
		
	};

	$scope.listarUsuarios();

});
