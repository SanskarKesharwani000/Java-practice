import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class B {
    public static void main(String[] args) {
        File file = new File("golu.txt");

        try {
            FileWriter wr = new FileWriter(file);        

            wr.write("Hello Yamraj Kaise Ho!!!");

            wr.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}