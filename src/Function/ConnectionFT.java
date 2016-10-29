/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author loann
 */
public class ConnectionFT {
    private static Connection conn;
    public static Connection getConnection()
    {
        try {
            String dbURL = "jdbc:sqlserver://localhost;databaseName=BANHANG;user=sa;password=123456";
            Connection conn = DriverManager.getConnection(dbURL);
            if(conn!=null)
            {
                System.out.println("Connected!");
//                String sql = "INSERT INTO sinhvien(name) VALUES (?)";
//                PreparedStatement statment = conn.prepareStatement(sql);
//                statment.setString(1, "loan kute");
//                statment.executeUpdate();
//                System.out.println("add successfuly--!");
               // JOptionPane.showMessageDialog(this, "add successfuly");
            }
        } catch (SQLException e) {
            System.out.println("Connect Fail");
        }
        return conn;
    }
//    public static void main(String[] args) {
//        getConnection();
//    }
    
}
