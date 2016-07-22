angular.module('app.controllers', [])

        .controller('bookAwayCtrl', function ($scope, ListaLivroService) {
            $scope.livrosProximos = ListaLivroService.getLivros();
        })

        .controller('estanteCtrl', function ($scope, ListaLivroService) {
            $scope.livros = ListaLivroService.getLivros();
        })

        .controller('loginCtrl', function ($scope) {

        })

        .controller('signupCtrl', function ($scope) {

        })

        .controller('meuPerfilCtrl', function ($scope) {

        })

        .controller('livroCtrl', function ($scope) {

        })

        .controller('visualizaLivroCtrl', function ($scope) {

        })



		.controller('novoLivroCtrl', function($scope, ListaLivroService) {
            $scope.novo{};
            $scope.getNovoLivro = function(livro){
                //add livro aqui
            }
-	        window.onload = function() {
+			document.getElementById('novoLivro-input13').addEventListener(novoLivro-button21, function() {
			 // Get the value of the name field.
			var name = document.getElementById($scope.titulo).value;

			 // Save the name in localStorage.
			 localStorage.setItem('name', name);
-					}
+					}
 				})

        .controller('favoritosCtrl', function ($scope, ListaLivroService) {
            $scope.favoritos = ListaLivroService.getLivros();
        })

        .controller('pesquisarCtrl', function ($scope, ListaLivroService) {
			$scope.todosLivros = ListaLivroService.getLivros();
			$scope.livroProcurado = $scope.data.search-item;
			$scope.livrosEncontrados[];
			for(int i = 0; i < ListaLivroService.livros.length; i++){
				if($livros[i].getAttribute("titulo")== $scope.livroProcurado){
					$scope.livroEncontrado = ListaLivroService.getLivro(i);
					$scope.livrosEncontrados.push($scope.livroEncontrado);
				}else if($livros[i].getAttribute("autor")== $scope.livroProcurado){
					$scope.livroEncontrado = ListaLivroService.getLivro(i);
					$scope.livrosEncontrados.push($scope.livroEncontrado);
				}else if($livros[i].getAttribute("colecao")== $scope.livroProcurado){
					$scope.livroEncontrado = ListaLivroService.getLivro(i);
					$scope.livrosEncontrados.push($scope.livroEncontrado);
				}else{
					alert("Nenhum resultado encontrado.");
				}
			}
			return livrosEncontrados;
        });
