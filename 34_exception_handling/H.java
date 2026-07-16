import java.io.FileNotFoundException;
import java.io.FileReader;

class H {
    public static void main(String[] args) {
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



// H.java:25: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader x = new FileReader("Bablu.txt");
//                        ^
// 1 error