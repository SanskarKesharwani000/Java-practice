import java.io.FileReader;

class I1 {
    I1() {
        System.out.println("I1() start");        
        FileReader x = new FileReader("Bablu.txt");
        System.out.println("I1() end");        
    }
}

class I extends I1 {
    public static void main(String[] args) {
        System.out.println("main() start");        
            I a = new I();
        System.out.println("main() end");
    }
}


// I.java:6: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader x = new FileReader("Bablu.txt");
//                        ^
// 1 error