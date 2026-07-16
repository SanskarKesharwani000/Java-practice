import java.io.FileReader;
import java.io.FileNotFoundException;

class L1 {
    L1() throws FileNotFoundException {
        System.out.println("L1() start");        
        FileReader x = new FileReader("Bablu.txt");
        System.out.println("L1() end");        
    }
}

class L extends L1 {
    L() {
        super();
    }
    public static void main(String[] args) {
        System.out.println("main() start");        
            L a = new L();
        System.out.println("main() end");
    }
}


// L.java:14: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         super();
//              ^
// 1 error