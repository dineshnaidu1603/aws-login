package cred;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class credentials {
    public static void insertRecord(int serial_number, String name, String gmail) throws SQLException, ClassNotFoundException {
        data1 connect = new data1();
        try {
            String insertQuery = "INSERT INTO today.final1(serial_number, name, date, gmail) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connect.con.prepareStatement(insertQuery);
            preparedStatement.setInt(1, serial_number);
            preparedStatement.setString(2, name);
            preparedStatement.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            preparedStatement.setString(4, gmail);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connect.con.close();
        }
    }
}
