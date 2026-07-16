import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class D {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("java.txt");

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("MOhan is a good boy...\n");
            bw.write("Java is a simple language...");

            bw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }    
}
