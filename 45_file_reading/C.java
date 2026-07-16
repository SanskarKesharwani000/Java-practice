import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class C {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("java.txt");

            int c = fr.read();

            while(c != -1) {
                System.out.print((char)c);
                c = fr.read();
            }

            fr.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
