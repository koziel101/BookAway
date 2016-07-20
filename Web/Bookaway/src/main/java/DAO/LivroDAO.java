package DAO;

import Model.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Usuario;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
    
    private Connection conn;

    public LivroDAO() {
        conn = Conexao.getConnection();
    }
    
    public boolean inserirLivro (Livro livro){
        String sql = "INSERT INTO livros(titulo, colecao, autor, genero, capa) VALUES(?,?,?,?,?)";
        Boolean retorno = false;
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, livro.getTitulo());
            pst.setString(2, livro.getColecao());
            pst.setString(3, livro.getAutor());
            pst.setString(4, livro.getGenero());
            pst.setString(5, livro.getCapa());

            if (pst.executeUpdate() == 0) {
                retorno = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }
    
    public void removeLivro(String capa) {
        try {
            String sql = "DELETE FROM livros WHERE capa=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, capa);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void editLivro(Livro livro) {
        try {
            String sql = "UPDATE livros set titulo=?, colecao=?, autor=?, genero?, capa?  where capa=?;";

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, livro.getTitulo());
            pst.setString(2, livro.getColecao());
            pst.setString(3, livro.getAutor());
            pst.setString(4, livro.getGenero());
            pst.setString(5, livro.getCapa());
            pst.setString(6, livro.getCapa());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
}
