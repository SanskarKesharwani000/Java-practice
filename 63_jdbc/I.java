import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.Scanner;

class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); 
                
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();

        sc.close();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","1234");
            
            String query = "insert into students (name,age,marks) value (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            System.out.println(ps);

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setFloat(3, marks);

            System.out.println(ps);

            int res = ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if(rs.next())
                System.out.println("Record ID: " + rs.getInt(1));

            System.out.println(res);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    
}
