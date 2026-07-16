import java.io.FileReader;
import java.io.FileNotFoundException;

class K1 {
    K1() throws FileNotFoundException {
        System.out.println("K1() start");        
        FileReader x = new FileReader("Bablu.txt");
        System.out.println("K1() end");        
    }
}

class K extends K1 {
    K() {

    }
    public static void main(String[] args) {
        System.out.println("main() start");        
            K a = new K();
        System.out.println("main() end");
    }
}


// K.java:13: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//     K() {
//         ^
// 1 error