function adicionaDiv(){
    var parte1 = "<div class=\"col-md-4\">";
    var parte2 = "<table>" + "<tr>";
    var parte3 = "<td style=\"padding-right: 20px; padding-left: 50px;\">";
    var parte4 = "<img src=" + link + "width=\"200\" height=\"300\">";
    var parte5 = "<a class=\"btn btn-transparent\" href=\"#edit\"  class=\"btn-block page-scroll\" style=\"width:95px; padding: 15px;\">Editar</a><a class=\"btn btn-light\" href=\"portifolio\" style=\"width:105px; padding: 15px;\">Remover</a>";
    var parte6 = "</td>" + "<td class=\"media-body\">";
    var parte7 = "<h3>" + titulo + "<\h3>";
    var parte8 = "<p>" + colecao + "<\p>";
    var parte9 = "<p>" + autor + "<\p>";
    var parte10 = "<\td>" + "<\tr>" + "<\table>";
     document.getElementById("tabela").innerHTML += parte1+ parte2 + parte3 + parte4 + parte5 + parte6 + parte7 + parte8 + parte9 + parte10;
}

