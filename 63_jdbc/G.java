import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class G {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

            String query = "update students set name=?,marks=? where student_id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, args[0]);
            ps.setFloat(2, Float.parseFloat(args[1]));
            ps.setInt(3, Integer.parseInt(args[2]));
        
            int rs = ps.executeUpdate();

            System.out.println(rs + " ~~~~");

            con.close();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }   
}