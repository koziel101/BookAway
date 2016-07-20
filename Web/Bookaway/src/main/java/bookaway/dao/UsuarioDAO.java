package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

/**
 * 
 * @author marjorie.goncalves
 */
public class UsuarioDAO {
    private Connection conn;
    public UsuarioDAO(){
        conn = Conexao.getConnection();
    }
    
    public boolean inserir(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO usuario(nome, login, CEP, email, senha) VALUES(?,?,?,?,?)";
        Boolean retorno = false;
        PreparedStatement pst = conn.prepareStatement(sql);
        try {
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getLogin());
            pst.setInt(3, usuario.getCEP());
            pst.setString(4, usuario.getEmail());
            pst.setString(5, usuario.getSenha());
            
            if(pst.executeUpdate() == 0){
                retorno = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }
    
    public void removeUser(String login){
		try {
				String sql = "DELETE FROM usuario WHERE login=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(2, login);
					pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    
    public void editUser(Usuario usuario){
		try {
			String sql = "UPDATE utilisateur set nome=? ,CEP=?, email=?, senha=?  where login=?;";

			PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, usuario.getNome());
				pst.setInt(2, usuario.getCEP());
				pst.setString(3, usuario.getEmail());
                                pst.setString(4, usuario.getSenha());
                                pst.setString(5, usuario.getLogin());
                                
				pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
