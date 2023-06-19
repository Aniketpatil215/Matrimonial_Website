
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aniket
 */
public class Database {

    Connection cn = null;
    Statement st = null;

    String ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
            return ("Database connected");
        } catch (Exception ex) {
            return (ex.toString());
        }
    }

    String Insert(String sql, String msg) {
        try {

            st = cn.createStatement();
            st.executeUpdate(sql);
            return ("Data Inserted");

        } catch (Exception ex) {
            return ex.toString();
        }
    }
    
    
    String Update(String sql, String msg) {
        try {
            st = cn.createStatement();
            st.executeUpdate(sql);
            return ("Records Updated");

        } catch (Exception ex) {
            
            return (ex.toString());
        }
    }

    
    String Delete(String sql, String msg) {
        try {
            st = cn.createStatement();
            st.executeUpdate(sql);
            return ("Records Deleted");

        } catch (Exception ex) {
            return (ex.toString());
        }
    }

    

}
