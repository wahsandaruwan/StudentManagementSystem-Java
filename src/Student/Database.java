/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author WAHSANDARUWAN
 */
public class Database {
    public Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/students_db","root","");
            return con;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Not Connected");
            return null;
        }
    }
}
