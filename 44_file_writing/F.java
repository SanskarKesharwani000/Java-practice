import java.io.PrintWriter;
import java.io.FileNotFoundException;

class F {
    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("python.txt");
           
            pw.println(true);
            pw.println(45.67);
            pw.println(new Student("gopal", 12));

            pw.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
