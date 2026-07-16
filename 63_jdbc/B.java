import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

class B {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","1234");
            
            String query = "insert into students (name,age,marks) value ('Manoj Vajpai', 21, 78.34)";
            PreparedStatement ps = con.prepareStatement(query);

            int res = ps.executeUpdate();

            System.out.println(res);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    
}
