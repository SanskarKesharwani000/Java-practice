import java.io.PrintWriter;
import java.io.FileNotFoundException;

class E {
    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("python.txt");

            // not ok
            // pw.write(true);
            // pw.write(45.67);
            // pw.write(new Student("gopal", 12));

            // ok
            pw.print(true);
            pw.print(45.67);
            pw.print(new Student("gopal", 12));

            pw.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
