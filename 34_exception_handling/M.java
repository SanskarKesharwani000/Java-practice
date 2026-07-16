import java.io.FileReader;
import java.io.FileNotFoundException;

class M1 {
    M1() throws FileNotFoundException {
        System.out.println("M1() start");        
        FileReader x = new FileReader("Bablu.txt");
        System.out.println("M1() end");        
    }
}

class M extends M1 {
    M() {
        try {
            super();
        } catch(FileNotFoundException e) {

        }
    }
    public static void main(String[] args) {
        System.out.println("main() start");        
            M a = new M();
        System.out.println("main() end");
    }
}


// M.java:15: error: call to super must be first statement in constructor
//             super();
//                  ^
// 1 error