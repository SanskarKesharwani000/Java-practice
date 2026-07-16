import java.io.FileReader;
import java.io.FileNotFoundException;

class G1 {
    public static void main(String[] args) {
        System.out.println("---- start");    
        try {
            FileReader x = new FileReader("mohan.txt"); 
        } catch(FileNotFoundException e) {
            e.printStackTrace();    
        }
        System.out.println("---- end");    
    }    
}
