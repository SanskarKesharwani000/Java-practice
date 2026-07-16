import java.io.FileNotFoundException;
import java.io.FileReader;

class H5 {
    public static void main(String[] args) throws FileNotFoundException  {
        System.out.println("main start");
        aaa();
        System.out.println("main end");
    }   
    
    static void aaa() {
        System.out.println("aaa start");
        bbb();
        System.out.println("aaa end");
    }
    
    static void bbb() {
        System.out.println("bbb start");
        ccc();
        System.out.println("bbb end");
    }
    
    static void ccc() {
        System.out.println("ccc start");
        FileReader x = new FileReader("Bablu.txt");
        System.out.println("ccc end");
    }
}
