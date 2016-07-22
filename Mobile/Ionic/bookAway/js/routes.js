angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider
    
  

      .state('menu.bookAway', {
    url: '/Home',
    views: {
      'side-menu21': {
        templateUrl: 'templates/bookAway.html',
        controller: 'bookAwayCtrl'
      }
    }
  })

  .state('menu.estante', {
    url: '/Estante',
    views: {
      'side-menu21': {
        templateUrl: 'templates/estante.html',
        controller: 'estanteCtrl'
      }
    }
  })

  .state('menu', {
    url: '/side-menu21',
    templateUrl: 'templates/menu.html',
    abstract:true
  })

  .state('menu.login', {
    url: '/Login',
    views: {
      'side-menu21': {
        templateUrl: 'templates/login.html',
        controller: 'loginCtrl'
      }
    }
  })

  .state('menu.signup', {
    url: '/SignUp',
    views: {
      'side-menu21': {
        templateUrl: 'templates/signup.html',
        controller: 'signupCtrl'
      }
    }
  })

  .state('menu.meuPerfil', {
    url: '/Perfil',
    views: {
      'side-menu21': {
        templateUrl: 'templates/meuPerfil.html',
        controller: 'meuPerfilCtrl'
      }
    }
  })

  .state('menu.livro', {
    url: '/RemoveLivro',
    views: {
      'side-menu21': {
        templateUrl: 'templates/livro.html',
        controller: 'livroCtrl'
      }
    }
  })

  .state('menu.visualizaLivro', {
    url: '/VisualizaLivro',
    views: {
      'side-menu21': {
        templateUrl: 'templates/visualizaLivro.html',
        controller: 'visualizaLivroCtrl'
      }
    }
  })

  .state('menu.novoLivro', {
    url: '/AdicionarLivro',
    views: {
      'side-menu21': {
        templateUrl: 'templates/novoLivro.html',
        controller: 'novoLivroCtrl'
      }
    }
  })

  .state('menu.favoritos', {
    url: '/Likes',
    views: {
      'side-menu21': {
        templateUrl: 'templates/favoritos.html',
        controller: 'favoritosCtrl'
      }
    }
  })

$urlRouterProvider.otherwise('/side-menu21/Home')

  

});