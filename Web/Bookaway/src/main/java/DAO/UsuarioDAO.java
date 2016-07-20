package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Usuario;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marjorie.goncalves
 */
public class UsuarioDAO {

    private Connection conn;

    public UsuarioDAO() {
        conn = Conexao.getConnection();
    }

    public boolean inserir(Usuario usuario) {
        String sql = "INSERT INTO usuario(nome, login, email, senha) VALUES(?,?,?,?)";
        Boolean retorno = false;
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getLogin());
            pst.setString(3, usuario.getEmail());
            pst.setString(4, usuario.getSenha());

            if (pst.executeUpdate() == 0) {
                retorno = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }

    public void removeUser(String login) {
        try {
            String sql = "DELETE FROM usuario WHERE login=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(2, login);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editUser(Usuario usuario) {
        try {
            String sql = "UPDATE utilisateur set nome=?, email=?, senha=?  where login=?;";

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getSenha());
            pst.setString(4, usuario.getLogin());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List getAllUsers() {
        List liste_utilisateur = new ArrayList();
        try {
            String sql = "SELECT * FROM utilisateur";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Usuario usuario = new Usuario();
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("email"));

                liste_utilisateur.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return liste_utilisateur;
    }
}
