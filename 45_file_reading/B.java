import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class B {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("java.txt");

            System.out.print((char)fr.read());
            System.out.print((char)fr.read());
            System.out.print((char)fr.read());
            System.out.print((char)fr.read());
            System.out.print((char)fr.read());

            fr.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
