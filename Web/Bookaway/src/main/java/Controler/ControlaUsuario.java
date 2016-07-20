package Controler;

/**
 *
 * @author marjorie.goncalves
 */
import DAO.UsuarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import Model.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

public class ControlaUsuario extends HttpServlet {

    private static final String UserRecord = null;
    private static String INSERT = "/NovoUsuario.jsp";//variable qui indique l'URL
    private static String edit = "/EditarConta.jsp";
    private static String delete = "/RemoverConta.jsp";
    private static String liste = "/ListarUsuarios.jsp";
    private UsuarioDAO dao;

    public ControlaUsuario() {
        super();
        dao = new UsuarioDAO();
    }

    // doGet perimite recuperar as informações
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        //Variavel de Redirecionamento
        String redirect = "";
        String uLogin = request.getParameter("login");
        //Variavel com a ação a ser executada no bando de Dados
        String action = request.getParameter("action");
        
        if ((uLogin == null) || (uLogin.isEmpty())) {
            System.out.println("Erro: Login nullo ou vazio");
        }
        else{
            switch (action){
                case "insert":
                    Usuario novoUsuario = new Usuario();
                    
                    novoUsuario.setNome(request.getParameter("nome"));
                    novoUsuario.setLogin(request.getParameter("login"));
                    novoUsuario.setSenha(request.getParameter("senha"));
                    novoUsuario.setEmail(request.getParameter("email"));
                    novoUsuario.setCEP(request.getParameter("cep"));
                    try {
                        dao.inserir(novoUsuario);
                    } catch (SQLException ex) {
                        Logger.getLogger(ControlaUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                
                case "delete":
                    String userLogin = request.getParameter("ID");
                    dao.removeUser(userLogin);
                    redirect = liste;
                    request.setAttribute("users", dao.getAllUsers());
                    System.out.println("Usuário removido");
                    break;
                    
                case "editform":
                    request.setAttribute("login", request.getParameter("login"));
                    redirect = edit;
                    break;
                    
                case "edit":
                    Usuario usuarioAlterado = new Usuario();
                    
                    usuarioAlterado.setNome(request.getParameter("nome"));
                    usuarioAlterado.setLogin(request.getParameter("login"));
                    usuarioAlterado.setSenha(request.getParameter("senha"));
                    usuarioAlterado.setEmail(request.getParameter("email"));
                    usuarioAlterado.setCEP(request.getParameter("cep"));
                    
                    dao.editUser(usuarioAlterado);
                    request.setAttribute("users", usuarioAlterado);
                    redirect = liste;
                    System.out.println("Usuario Alterado");
                    break;
                    
                case "listuser":
                    redirect = UserRecord;
                    request.setAttribute("users", dao.getAllUsers());
                    break;
                    
                default :
                    redirect = INSERT;
            }
            
            /*	request Dispatcher
            *  1- request : O request que chega do client
            *  2- dispatcher : O redirecionamento
            * */
            RequestDispatcher rd = request.getRequestDispatcher(redirect);
            try {
                rd.forward(request, response);
            } catch (ServletException | IOException ex) {
                Logger.getLogger(ControlaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        doGet(request, response);
    }
}
