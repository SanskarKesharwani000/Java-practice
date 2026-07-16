import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        File file = new File("golu.txt");

        try {
            FileWriter wr = new FileWriter(file);        

            wr.write(97);
            wr.write('m');
            wr.write('i');
            wr.write('t');

            wr.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}