package Controller;

import DAO.LivroDAO;
import Model.Livro;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookControl extends HttpServlet {

    private LivroDAO dao;

    public BookControl() {
        super();
        dao = new LivroDAO();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        switch (action) {
            case "addLivro":
                Livro livro = new Livro();

                livro.setTitulo(request.getParameter("titulo"));
                livro.setColecao(request.getParameter("login"));
                livro.setAutor(request.getParameter("autor"));
                livro.setGenero(request.getParameter("genero"));
                livro.setCapa(request.getParameter("capa"));
                dao.inserirLivro(livro);

                out.println("<div class=\"col-md-4\">");
                out.println("<table>");
                out.println("<tr>");
                out.println("<td style=\"padding-right: 20px; padding-left: 50px;\">");
                out.println("<img src=" + livro.getCapa() + "width=\"200\" height=\"300\">");
                out.println("<a class=\"btn btn-transparent\" href=\"#edit\"  class=\"btn-block page-scroll\" style=\"width:95px; padding: 15px;\">Editar</a>"
                        + "<a class=\"btn btn-light\" href=\"portifolio\" style=\"width:105px; padding: 15px;\">Remover</a>");
                out.println("</td>");
                out.println("<td class=\"media-body\">");
                out.println("<h3>" + livro.getTitulo() + "</h3>");
                out.println("<p>" + livro.getColecao() + "</p>");
                out.println("<p>" + livro.getAutor() + "</p>");
                out.println("</td>");
                out.println("</tr>");
                out.println("</table>");
                out.println("</div>");
                break;

            case "delLivro":
                dao.removeLivro(request.getParameter("capa"));
                System.out.println("Usuário removido");
                break;

            case "altLivro":
                Livro altLivro = new Livro();

                altLivro.setTitulo(request.getParameter("titulo"));
                altLivro.setColecao(request.getParameter("login"));
                altLivro.setAutor(request.getParameter("autor"));
                altLivro.setGenero(request.getParameter("genero"));
                altLivro.setCapa(request.getParameter("capa"));

                dao.editLivro(altLivro, request.getParameter("id"));
//                request.setAttribute("users", usuarioAlterado);
                System.out.println("Usuario Alterado");
                break;

            default:
        }

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BookControl</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BookControl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
