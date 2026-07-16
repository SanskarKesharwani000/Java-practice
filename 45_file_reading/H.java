import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class H {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("java.txt");

            BufferedReader br = new BufferedReader(fr);

            String next = null;

            while((next=br.readLine()) != null) {
                System.out.println(next);
            }

            br.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
