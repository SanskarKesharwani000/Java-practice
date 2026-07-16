import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class D {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("java.txt");

            int c = 0;

            while((c=fr.read()) != -1) {
                System.out.print((char)c);
            }

            fr.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
