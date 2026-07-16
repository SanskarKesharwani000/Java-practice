import java.io.FileReader;
import java.io.FileNotFoundException;

class J1 {
    J1() throws FileNotFoundException {
        System.out.println("J1() start");        
        FileReader x = new FileReader("Bablu.txt");
        System.out.println("J1() end");        
    }
}

class J extends J1 {
    public static void main(String[] args) {
        System.out.println("main() start");        
            J a = new J();
        System.out.println("main() end");
    }
}


// J.java:12: error: unreported exception FileNotFoundException in default constructor
// class J extends J1 {
// ^
// 1 error