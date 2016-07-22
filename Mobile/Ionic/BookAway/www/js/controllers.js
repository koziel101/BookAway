angular.module('app.controllers', [])

        .controller('bookAwayCtrl', function ($scope) {
            $scope.livrosProximos = [
                {titulo: 'Harry Potter e as Reliquias da Morte', id: 1, photo: 'img/livros/reliquias da morte.jpg', autor: 'J.K. Rowling', colecao: 'Harry Potter Saga'},
                {titulo: 'A Song of Ice and Fire', id: 2, photo: 'img/livros/game of thrones.jpg', autor: 'G.R.R. Martin', colecao: 'A Song of Ice and Fire'},
                {titulo: 'Sonho de uma noite de verão', id: 3, photo: 'img/livros/sonho noite verao.jpg', autor: 'Willian', colecao: 'Sem Coleção'},
                {titulo: 'Eragon', id: 4, photo: 'img/livros/eragon.jpg', autor: 'Christopher Paolini', colecao: 'Eragon Saga'},
                {titulo: 'The Hunger Games', id: 5, photo: 'img/livros/the hunger games.jpg', autor: 'Suzane Collins', colecao: 'The Hunger Games Saga'},
                {titulo: 'The Fellowship of the Ring', id: 6, photo: 'img/livros/fotr.jpg', autor: 'J.R.R. Tolkien', colecao: 'The Lord of the Rings'}
            ];
        })

        .controller('estanteCtrl', function ($scope) {
            $scope.livros = [
                {titulo: 'Harry Potter e as Reliquias da Morte', id: 1, photo: 'img/livros/reliquias da morte.jpg', autor: 'J.K. Rowling', colecao: 'Harry Potter Saga'},
                {titulo: 'A Song of Ice and Fire', id: 2, photo: 'img/livros/game of thrones.jpg', autor: 'G.R.R. Martin', colecao: 'A Song of Ice and Fire'},
                {titulo: 'Sonho de uma noite de verão', id: 3, photo: 'img/livros/sonho noite verao.jpg', autor: 'Willian', colecao: 'Sem Coleção'},
                {titulo: 'Eragon', id: 4, photo: 'img/livros/eragon.jpg', autor: 'Christopher Paolini', colecao: 'Eragon Saga'},
                {titulo: 'The Hunger Games', id: 5, photo: 'img/livros/the hunger games.jpg', autor: 'Suzane Collins', colecao: 'The Hunger Games Saga'},
                {titulo: 'The Fellowship of the Ring', id: 6, photo: 'img/livros/fotr.jpg', autor: 'J.R.R. Tolkien', colecao: 'The Lord of the Rings'}
            ];
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



				.controller('novoLivroCtrl', function($scope) {
-	window.onload = function() {
+				document.getElementById('novoLivro-input13').addEventListener(novoLivro-button21, function() {
			 // Get the value of the name field.
			 var name = document.getElementById($scope.titulo).value;

			 // Save the name in localStorage.
			 localStorage.setItem('name', name);
-					}
+					}
 				})

        .controller('favoritosCtrl', function ($scope) {

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
