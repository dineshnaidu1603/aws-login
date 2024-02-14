package cred;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class data1 {
    Connection con;
    data1() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/today", "root", "Dinesh@1603");
    }
}
