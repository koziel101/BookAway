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



        .controller('novoLivroCtrl', function ($scope) {
            window.onload = function () {
                document.getElementById('novoLivro-input13').addEventListener(novoLivro - button21), function () {
                    // Get the value of the name field.
                    var name = document.getElementById($scope.titulo).value;

                    // Save the name in localStorage.
                    localStorage.setItem('name', name);
                }
            }
        })

                .controller('favoritosCtrl', function ($scope) {

                })

                .controller('pesquisarCtrl', function ($scope) {

                });
