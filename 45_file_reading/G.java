import java.io.FileReader;
import java.io.IOException;

class G {
    public static void main(String[] args) throws IOException {    
        FileReader fr = new FileReader("java.txt");

        char[] arr = new char[100];

        int count = 0;

        while((count=fr.read(arr)) != -1) {
            for(int i=0;i<count;i++)
                System.out.print(arr[i]);
    
            // System.out.println("\n"+count);
        }
        
        fr.close();
    }    
}
