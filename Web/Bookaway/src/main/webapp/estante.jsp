<%-- 
    Document   : estante
    Created on : 20/07/2016, 16:54:30
    Author     : Hiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">

        <title>BookAway Minha Estante</title>

        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="keywords" content="">
        <meta name="author" content="">

        <!-- Bootstrap Css -->
        <link href="bootstrap-assets/css/bootstrap.min.css" rel="stylesheet">

        <!-- Style -->
        <link href="plugins/owl-carousel/owl.carousel.css" rel="stylesheet">
        <link href="plugins/owl-carousel/owl.theme.css" rel="stylesheet">
        <link href="plugins/owl-carousel/owl.transitions.css" rel="stylesheet">
        <link href="plugins/Lightbox/dist/css/lightbox.css" rel="stylesheet">
        <link href="plugins/Icons/et-line-font/style.css" rel="stylesheet">
        <link href="plugins/animate.css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <!-- Icons Font -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <!-- Preloader
            ============================================= -->
        <div class="preloader"><i class="fa fa-circle-o-notch fa-spin fa-2x"></i></div>
        <!-- Header
            ============================================= -->
        <section class="main-header">
            <nav class="navbar navbar-default navbar-fixed-top">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#"></a>
                    </div>
                    <div class="collapse navbar-collapse text-center" id="bs-example-navbar-collapse-1">
                        <div class="col-md-8 col-xs-12 nav-wrap">
                            <ul class="nav navbar-nav">
                                <li><a href="livrosEmMovimento.jsp" >Home</a></li>
                                <li><a href="pesquisa.html">Pesquisar</a></li>
                                <li><a href="#services" class="page-scroll">Estante</a></li>
                                <li><a href="perfil.html">Minha Conta</a></li>
                                <li><a href="index.jsp">Sair</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </nav>
            <br>
            <br>
            <br>
            <br>
        </section>

        <!-- Estante
            ============================================= -->
        <section id="services">
            <div class="container">
                <h2>Resultados:</h2>
                <hr class="light-sep">
                <div class="services-box">
                    <div id='tabela' class="row wow fadeInUp" data-wow-delay=".3s" style="padding-bottom: 40px;">
                        <div class="col-md-4">
                            <table>
                                <tr>
                                    <td style="padding-right: 20px; padding-left: 50px;"> 
                                        <img src="img/estante/Harry_Potter.jpg" width="200" height="300" alt="HarryPotter">
                                        <a class="btn btn-transparent" href="editarLivro.jsp"  class="btn-block page-scroll"  accesskey=""style="width:95px; padding: 15px;">Editar</a><a class="btn btn-light" href="" style="width:105px; padding: 15px;">Remover</a>
                                    </td>
                                    <td class="media-body">
                                        <h3>Harry Potter e as Relíquias da Morte</h3>
                                        <p>Coleção: Harry Potter</p>
                                        <p>J. K. Rowling</p>
                                    </td>
                                </tr>
                            </table>
                        </div>
                        <div class="col-md-4">
                            <table>
                                <tr>
                                    <td style="padding-right: 20px; padding-left: 50px;"> 
                                        <img src="img/estante/Sonho_William.jpg" width="190" height="290" alt="Sonho">
                                        <a class="btn btn-light" href="#e"  class="btn-block page-scroll">Remover Livro</a>
                                    </td>
                                    <td class="media-body">
                                        <h3>Sonho de uma noite de verão</h3>
                                        <p>William Shakespeare</p>
                                    </td>
                                </tr>
                            </table>
                        </div>
                        <div class="col-md-4">
                            <table>
                                <tr>
                                    <td style="padding-right: 20px; padding-left: 50px;"> 
                                        <img src="img/estante/eragon.jpg" width="190" height="290" alt="Eragon">
                                        <a class="btn btn-light" href="#portfolio">Remover Livro</a>
                                    </td>
                                    <td class="media-body">
                                        <h3>Eragon</h3>
                                        <p>Coleção: Trilogia: A Herança</p>
                                        <p>Christopher Paolini</p>
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </div>

                    <div class="row wow fadeInUp" data-wow-delay=".3s" style="padding-bottom: 40px;">
                        <div class="col-md-4">
                            <table>
                                <tr>
                                    <td style="padding-right: 20px; padding-left: 50px;"> 
                                        <img src="img/estante/fotr.jpg" width="190" height="290" alt="FotR">
                                        <a class="btn btn-light" href="#portfolio">Remover Livro</a>
                                    </td>
                                    <td class="media-body">
                                        <h3>The fellowship of the Ring</h3>
                                        <p>Coleção: The Lord of the Rings</p>
                                        <p>J.R.R. Tolkien</p>
                                    </td>
                                </tr>
                            </table>
                        </div>
                        <div class="col-md-4">
                            <table>
                                <tr>
                                    <td style="padding-right: 20px; padding-left: 50px;"> 
                                        <img src="img/estante/The_Hunger_Games.jpg" width="190" height="290" alt="THG">
                                        <a class="btn btn-light" href="#portfolio">Remover Livro</a>
                                    </td>
                                    <td class="media-body">
                                        <h3>Jogos Vorazes</h3>
                                        <p>Coleção: Jogos Vorazes</p>
                                        <p>Suzanne Collins</p>
                                    </td>
                                </tr>
                            </table>
                        </div>
                        <div class="col-md-4">
                            <table>
                                <tr>
                                    <td style="padding-right: 20px; padding-left: 50px;"> 
                                        <img src="img/estante/Game.jpg" width="190" height="290" alt="GoT">
                                        <a class="btn btn-light" href="#portfolio">Remover Livro</a>
                                    </td>
                                    <td class="media-body">
                                        <h3>Game of Thrones (5 primeiros livros)</h3>
                                        <p>Coleção: Game of Thrones</p>
                                        <p>George R. R. Martin</p>
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <hr class="light-sep">
        </section>

        <!-- Adicionar Livro-->
        <section id="edit">
            <div class="container">
                <h2>Adicionar Livro</h2>
                <hr class="light-sep">
                <div class="services-box">
                    <div class="col-md-4" style="margin-left: 50px;">
                        <div class="media-left"><img src="img/estante/capa_livro.jpg" width="190" height="290" alt="capa">
                        </div>
                    </div>
                    <div class="col-md-6">
                        <form method="post" action="BookControl" enctype="multipart/form-data">
                            <br>
                            <h6>Título</h6>
                            <input type="text" required="required" class="form-control" name="titulo" placeholder="Título">

                            <h6>Coleção</h6>
                            <input type="text" class="form-control" name="Colecao" placeholder="Colecao">

                            <h6>Autor(a)</h6>
                            <input type="text" required="required" class="form-control" name="Autor" placeholder="Autor(a)">

                            <h6>Gênero</h6>
                            <input type="text" required="required" class="form-control" name="Genero" placeholder="Gênero">

                            <h6>Capa</h6>
                            <input type="file" required="required" name="Capa"><br>

                            <input type="submit"  value="Adicionar Livro" class="btn-block page-scroll" style='background: #808080;'>
                        </form>
                    </div>
                </div>
            </div>
            <hr class="light-sep">
        </section>


        <!-- Footer
                ============================================= -->
        <footer>
            <div class="container">
                <h1>BookAway</h1>
                <h6>Powered by: <span>Rise</span></h6>
            </div>
        </footer>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="bootstrap-assets/js/bootstrap.min.js"></script>
        <script src="js/custom.js"></script>
        <!-- JS PLUGINS -->
        <script src="plugins/owl-carousel/owl.carousel.min.js"></script>
        <script src="js/jquery.easing.min.js"></script>
        <script src="plugins/waypoints/jquery.waypoints.min.js"></script>
        <script src="plugins/countTo/jquery.countTo.js"></script>
        <script src="plugins/inview/jquery.inview.min.js"></script>
        <script src="plugins/Lightbox/dist/js/lightbox.min.js"></script>
        <script src="plugins/WOW/dist/wow.min.js"></script>
        <!-- GOOGLE MAP -->
        <script src="https://maps.googleapis.com/maps/api/js"></script>
    </body>
</html>

