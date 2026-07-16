import java.io.FileReader;
import java.io.FileNotFoundException;

class O1 {
    O1() throws FileNotFoundException {
        System.out.println("O1() start");        
        FileReader x = new FileReader("Dablu.txt");
        System.out.println("O1() end");        
    }
}

class O extends O1 {
    O() throws FileNotFoundException {
        super();
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("main() start");        
        O a = new O();
        System.out.println("main() end");
    }
}
