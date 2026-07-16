import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

class J {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","1234");
            
            String query = "insert into students (name,age,marks) values ('Umesh', 12, 67.22), ('Ramesh', 15, 92.23), ('Dinesh', 9, 77.76)";
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            int res = ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            while(rs.next())
                System.out.println("Record ID: " + rs.getInt(1));

            System.out.println(res);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    
}
