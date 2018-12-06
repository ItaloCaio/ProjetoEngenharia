angular.module("appCadastro",[]);

angular.module("appCadastro").controller("appEpisodioCtrl", function($scope, $http){

	urlAnime = 'http://localhost:8080/ProjetoControleDeAnimes/rest/anime';
	urlUsuario = 'http://localhost:8080/ProjetoControleDeAnimes/rest/login';
	urlEpisodios = 'http://localhost:8080/ProjetoControleDeAnimes/rest/episodios';
	urlEpisodiosBaixados = 'http://localhost:8080/ProjetoControleDeAnimes/rest/episodios_baixados';
	urlEpisodiosAssistidos = 'http://localhost:8080/ProjetoControleDeAnimes/rest/episodios_assistidos';

	$scope.listarUsuarios = function () {
	     $http.get(urlUsuario).then(successCallback, errorCallback);
	 
	     function successCallback(response){
	         $scope.usuarios = response.data;

	         var user = function(usuario){
		        	$scope.usuario = usuario;
		        }
		        
		        
		      $scope.usuarios.forEach(user) ;
		      console.log($scope.usuario);
	     }
	     function errorCallback(error){
	         alert("erro no get");
	     }
	 };

	 $scope.listarEpisodios = function () {
	     $http.get(urlEpisodios).then(successCallback, errorCallback);
	 
	     function successCallback(response){
	         $scope.episodios = response.data;

	         console.log("runnig");

	         
	     }
	     function errorCallback(error){
	         alert("erro no get");
	     }
	 };

	 $scope.listarEpisodiosBaixados = function () {
	     $http.get(urlEpisodiosBaixados).then(successCallback, errorCallback);
	 
	     function successCallback(response){
	         $scope.episodiosBaixados = response.data;

	         console.log("runnig");

	         
	     }
	     function errorCallback(error){
	         alert("erro no get");
	     }
	 };

	 $scope.listarEpisodiosAssistidos = function () {
	     $http.get(urlEpisodiosAssistidos).then(successCallback, errorCallback);
	 
	     function successCallback(response){
	         $scope.episodiosAssistidos = response.data;

	         console.log("runnig assistidos");

	         
	     }
	     function errorCallback(error){
	         alert("erro no get");
	     }
	 };
	
	 
	$scope.listarAnimes = function () {
	    $http.get(urlAnime).then(successCallback, errorCallback);
	 
	    function successCallback(response){
	    	console.log("sucess anime");
	        $scope.animes = response.data;
	    
	        
	     }
	     function errorCallback(error){
	         alert("erro no get");
	     }
	};
	
	
	
	$scope.adicionaAnime = function(anime){
		
		 $http.post(urlMeusAnimes, anime).then(function (response){
	    	
			
	
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
	

	$scope.adicionaEpisodios = function(anime){
		
		 $http.put(urlEpisodios, anime).then(function (response){
	    	
			console.log("Post open");
	
	     });
	};

	$scope.adicionaEpisodioBaixado = function(episodio){
		
		 $http.post(urlEpisodiosBaixados, episodio).then(function (response){
	    	
			console.log("Post open");
	
	     });
	};

	$scope.adicionaEpisodioAssistido = function(episodio){
		
		 $http.post(urlEpisodiosAssistidos, episodio).then(function (response){
	    	
			console.log("Post open Assistidos");
	
	     });
	};

	 $scope.removeUsuario = function(){
	 		
	 		$http.delete(urlUsuario).then(function (response){
	 		
	 		
			});


	 };
	
	$scope.listarUsuarios();
	$scope.listarEpisodios();
	$scope.listarAnimes();
	$scope.listarEpisodiosBaixados();
	$scope.listarEpisodiosAssistidos();
});
