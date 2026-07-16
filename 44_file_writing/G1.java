import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

class G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Your Marks: ");
        float marks = sc.nextFloat();
        
        sc.close();
        
        try {
            PrintWriter pw = new PrintWriter("ruby.txt");

            pw.print("My Name Is: name And My Age Is: age  And My Marks: marks");

            pw.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
