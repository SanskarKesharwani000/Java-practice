import java.io.FileWriter;
import java.io.IOException;

class C {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("monu.txt");

        char[] x = {'M','r','i','t','y','u','n','j','a','y'};

        fw.write(x);

        fw.close();
    }    
}
