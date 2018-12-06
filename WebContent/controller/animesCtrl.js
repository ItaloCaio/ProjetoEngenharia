angular.module("appCadastro",[]);

angular.module("appCadastro").controller("animesCtrl", function($scope, $http){
	
	$scope.cont = 0;
	
	urlAnime = 'http://localhost:8080/ProjetoControleDeAnimes/rest/anime';
	urlUsuario = 'http://localhost:8080/ProjetoControleDeAnimes/rest/login';
	urlMeusAnimes = 'http://localhost:8080/ProjetoControleDeAnimes/rest/meus_animes'
	urlEpisodios = 'http://localhost:8080/ProjetoControleDeAnimes/rest/episodios';
	urlEpisodiosBaixados = 'http://localhost:8080/ProjetoControleDeAnimes/rest/episodios_baixados';
	urlEpisodiosAssistidos = 'http://localhost:8080/ProjetoControleDeAnimes/rest/episodios_assistidos';


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
	

	
	$scope.listarAnimes = function () {
	    $http.get(urlAnime).then(successCallback, errorCallback);
	 
	    function successCallback(response){
	    	console.log("sucess");
	        $scope.animes = response.data;
	    
	        
	     }
	     function errorCallback(error){
	         alert("erro no get");
	     }
	};

	$scope.listarMeusAnimes = function () {
	    $http.get(urlMeusAnimes).then(successCallback, errorCallback);
	 
	    function successCallback(response){
	    	console.log("sucess");
	        $scope.meusAnimes = response.data;
	    
	        
	     }
	     function errorCallback(error){
	         alert("erro no get");
	     }
	};

	$scope.desabilitaBotao = function(){

		$scope.cont = 1;

	}



	$scope.adicionaEpisodios = function(anime){
		
		 $http.put(urlEpisodios, anime).then(function (response){
	    	
			console.log("Post open");
	
	     });
	};

	$scope.getMeusAnimes = function(usuario){

		$http.put(urlMeusAnimes, usuario).then(function(response){


		});
	};

	$scope.getEpisodiosBaixados = function(usuario){

		$http.put(urlEpisodiosBaixados, usuario).then(function(response){

			console.log("put do episodios baixados");


		});
	};

	$scope.getEpisodiosAssistidos = function(usuario){

		$http.put(urlEpisodiosAssistidos, usuario).then(function(response){

			console.log("put do episodios assistidos");


		});
	};
	
	$scope.adicionaAnime = function(anime){
		
		 $http.post(urlMeusAnimes, anime).then(function (response){
	    	
			
	
	     });
	}

	 $scope.removeUsuario = function(){
	 		
	 		$http.delete(urlUsuario).then(function (response){
	 		
	 		
			});


	 }
	
	$scope.listarUsuarios();
	$scope.listarAnimes();
	$scope.listarMeusAnimes();

});
