import java.io.FileNotFoundException;
import java.io.FileReader;

class P {
    public static void main(String[] args)  {
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
        try {
              ccc();
        } catch(FileNotFoundException e) {
             System.out.println("Hello");    
        }
        System.out.println("bbb end");
    }
    
    static void ccc() throws FileNotFoundException {
        System.out.println("ccc start");
        FileReader x = new FileReader("Bablu.txt");
        System.out.println("ccc end");
    }
}
