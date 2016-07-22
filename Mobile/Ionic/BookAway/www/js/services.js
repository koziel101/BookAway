angular.module('app.services', [])

.factory('Persistence', function($q) {
    //persistence.store.memory.config(persistence);

    persistence.store.cordovasql.config(persistence, 'app_db', '0.0.1', 'Database description', 5 * 1024 * 1024, 0);

    var entities = {};

    entities.Playlist = persistence.define('livros', {
      title: 'TEXT'
    });

    persistence.debug = true;
    persistence.schemaSync();

    return {
      Entities: entities,

      add: function(playlist) {
        persistence.add(playlist);
        persistence.flush();
      },

      getAllPlaylists: function() {
        var defer = $q.defer();

        entities.Playlist.all().list(null, function (playlists) {
          defer.resolve(playlists);
        });

        return defer.promise;
      }
    };
  })

  .service('ListaLivroService', function(titulop, photop, autorp, colecaop) {
   return {
     livros: [
      { titulo: titulop, id: titulo, photo: photop, autor: autorp, colecao: colecaop },
      { titulo: 'A Song of Ice and Fire', id: '2', photo: 'img/livros/game of thrones.jpg', autor: 'G.R.R. Martin', colecao: 'A Song of Ice and Fire' },
      { titulo: 'Sonho de uma noite de verão', id: '3', photo: 'img/livros/sonho noite verao.jpg', autor: 'Willian', colecao: 'Sem Coleção' },
      { titulo: 'Eragon', id: '4', photo: 'img/livros/eragon.jpg', autor: 'Christopher Paolini', colecao: 'Eragon Saga' },
      { titulo: 'The Hunger Games', id: '5', photo: 'img/livros/the hunger games.jpg', autor: 'Suzane Collins', colecao: 'The Hunger Games Saga' },
      { titulo: 'The Fellowship of the Ring', id: '6', photo: 'img/livros/fotr.jpg', autor: 'J.R.R. Tolkien', colecao: 'The Lord of the Rings' }
     ],
     getLivros: function() {
       return this.livros;
     },
     getLivro: function(livroID) {
       for(i=0;i<this.c.length;i++){
         if(this.livros[i].id == livroId){
           return this.livros[i];
         }
       }
     }
   }
  })

.service('BlankService', [function(){

}]);
