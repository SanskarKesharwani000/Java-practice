import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

class G2 {
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
            PrintWriter pw = new PrintWriter("php.txt");

            // Format Specifiers: %s-string, %d-decimal(integer), %f-float
            pw.printf("My Name Is: %s- And My Age Is: %d-  And My Marks: %.2f-", name, age, marks);

            pw.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
