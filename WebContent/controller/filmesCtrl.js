angular.module("appCadastro",[]);

angular.module("appCadastro").controller("animesCtrl", function($scope, $http){

	
	urlAnime = 'http://localhost:8080/ProjetoControleDeAnimes/rest/anime';
	urlUsuario = 'http://localhost:8080/ProjetoControleDeAnimes/rest/login';
	urlMeusAnimes = 'http://localhost:8080/ProjetoControleDeAnimes/rest/meus_animes'



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

});
