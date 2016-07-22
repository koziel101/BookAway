angular.module('app.controllers', [])
  
.controller('bookAwayCtrl', function($scope) {
	$scope.livrosProximos = [
    { titulo: 'Harry Potter e as Reliquias da Morte', id: 1, photo: 'img/livros/reliquias da morte.jpg', autor: 'J.K. Rowling', colecao: 'Harry Potter Saga' },
    { titulo: 'A Song of Ice and Fire', id: 2, photo: 'img/livros/game of thrones.jpg', autor: 'G.R.R. Martin', colecao: 'A Song of Ice and Fire' },
    { titulo: 'Sonho de uma noite de verão', id: 3, photo: 'img/livros/sonho noite verao.jpg', autor: 'Willian', colecao: 'Sem Coleção' },
    { titulo: 'Eragon', id: 4, photo: 'img/livros/eragon.jpg', autor: 'Christopher Paolini', colecao: 'Eragon Saga' },
    { titulo: 'The Hunger Games', id: 5, photo: 'img/livros/the hunger games.jpg', autor: 'Suzane Collins', colecao: 'The Hunger Games Saga' },
    { titulo: 'The Fellowship of the Ring', id: 6, photo: 'img/livros/fotr.jpg', autor: 'J.R.R. Tolkien', colecao: 'The Lord of the Rings' }
  ];
})
   
.controller('estanteCtrl', function($scope) {
	$scope.livros = [
    { titulo: 'Harry Potter e as Reliquias da Morte', id: 1, photo: 'img/livros/reliquias da morte.jpg', autor: 'J.K. Rowling', colecao: 'Harry Potter Saga' },
    { titulo: 'A Song of Ice and Fire', id: 2, photo: 'img/livros/game of thrones.jpg', autor: 'G.R.R. Martin', colecao: 'A Song of Ice and Fire' },
    { titulo: 'Sonho de uma noite de verão', id: 3, photo: 'img/livros/sonho noite verao.jpg', autor: 'Willian', colecao: 'Sem Coleção' },
    { titulo: 'Eragon', id: 4, photo: 'img/livros/eragon.jpg', autor: 'Christopher Paolini', colecao: 'Eragon Saga' },
    { titulo: 'The Hunger Games', id: 5, photo: 'img/livros/the hunger games.jpg', autor: 'Suzane Collins', colecao: 'The Hunger Games Saga' },
    { titulo: 'The Fellowship of the Ring', id: 6, photo: 'img/livros/fotr.jpg', autor: 'J.R.R. Tolkien', colecao: 'The Lord of the Rings' }
  ];
})
      
.controller('loginCtrl', function($scope) {

})
   
.controller('signupCtrl', function($scope) {

})
   
.controller('meuPerfilCtrl', function($scope) {

})
   
.controller('livroCtrl', function($scope) {

})
   
.controller('visualizaLivroCtrl', function($scope) {

})
   
.controller('novoLivroCtrl', function($scope) {

})
   
.controller('favoritosCtrl', function($scope) {

})
 