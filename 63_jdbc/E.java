import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.io.Console;

class E {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.print("Enter student id...: ");
        int studentId = Integer.parseInt(c.readLine());
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

            PreparedStatement ps = con.prepareStatement("select * from students where student_id=?");

            ps.setInt(1, studentId);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getInt("age") + " - " +  rs.getFloat("marks"));
            }

            con.close();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }   
}