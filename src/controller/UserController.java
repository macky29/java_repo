/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DatabaseConnection;

/**
 *
 * @author Asus
 */
public class UserController {

    public boolean checkUser(String u, String p) {
        Connection c = DatabaseConnection.getConnection();
        
        try {
            PreparedStatement ps = c.prepareStatement("SELECT * from login WHERE username = ? and password = ? ");

            ps.setString(1, u);
            ps.setString(2, p);
            ResultSet rs = ps.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
}
