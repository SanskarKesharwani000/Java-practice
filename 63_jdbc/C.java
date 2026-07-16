import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

class C {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","1234");
            
            String query = "insert into students (name,age,marks) value (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            System.out.println(ps);

            ps.setString(1, args[0]);
            ps.setInt(2, Integer.parseInt(args[1]));
            ps.setFloat(3, Float.parseFloat(args[2]));

            System.out.println(ps);

            int res = ps.executeUpdate();

            System.out.println(res);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    
}
