package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Connection con = null;

    public static Connection getConnection() {
        if (con != null) {
            return con;
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/personne";
                String user = "root";
                String passwd = "zero";

                con = DriverManager.getConnection(url, user, passwd);
                System.out.println("Connexion effective !");

            } catch (ClassNotFoundException cne) {
                System.out.println("***Driver***");
                cne.printStackTrace();
            } catch (SQLException e) {
                System.out.println("***SQLException***");
                System.out.println(e);
            }
            return con;
        }
    }
}
