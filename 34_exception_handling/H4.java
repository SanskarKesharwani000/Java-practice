import java.io.FileNotFoundException;
import java.io.FileReader;

class H4 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("main start");
        aaa();
        System.out.println("main end");
    }   
    
    static void aaa() throws FileNotFoundException {
        System.out.println("aaa start");
        bbb();
        System.out.println("aaa end");
    }
    
    static void bbb() throws FileNotFoundException {
        System.out.println("bbb start");
        ccc();
        System.out.println("bbb end");
    }
    
    static void ccc() throws FileNotFoundException {
        System.out.println("ccc start");
        FileReader x = new FileReader("Bablu.txt");
        System.out.println("ccc end");
    }
}



// main start
// aaa start
// bbb start
// ccc start
// Exception in thread "main" java.io.FileNotFoundException: Bablu.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at H4.ccc(H4.java:25)
//         at H4.bbb(H4.java:19)
//         at H4.aaa(H4.java:13)
//         at H4.main(H4.java:7)