import java.sql.*;

class H {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb", "root", "1234");

            String query = "delete from students where student_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, Integer.parseInt(args[0]));


            int res = ps.executeUpdate();

            System.out.println(res);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    
}
