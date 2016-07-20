<%-- 
    Document   : NovoUsuario
    Created on : 20/07/2016, 14:47:30
    Author     : Marjorie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta http-equiv="content-type" content="text/html; charset=UTF-8">

        <title>BookAway</title>

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
        <!-- Acesse 
             ============================================= -->
        <section id="fun-facts">
            <div style='margin-bottom: 200px;' class="container">
                <h2>Acesse </h2>
                <hr class="light-sep">
                <p>Comece a movimentar seus livros!</p>
                <div class="col-md-6 col-md-offset-3 wow fadeInUp" data-wow-delay=".3s">
                    <form style='margin-top:70px;'>
                        <div class="form-group">
                            <input style= 'border: 2px solid #24242a; color: #fff; min-height: 45px; border-radius: 0;' type="text" class="form-control" id="LoginUnico" placeholder="Username">
                        </div>
                        <div class="form-group">
                            <input style= 'border: 2px solid #24242a; color: #fff; min-height: 45px; border-radius: 0;' type="password" class="form-control" id="senha" placeholder="Senha">
                        </div>
                        <a href="livrosemmovimento.html" class="btn-block" style='background: #fff; color: #0d0d0d; margin-top: 35px;'>Login</a>
                        <a href="#" class="btn-block" style='background: #3B5998;' >Login com facebook</a>
                    </form>
                </div>
            </div>
        </section>
        <!-- Informações 
             ============================================= -->
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