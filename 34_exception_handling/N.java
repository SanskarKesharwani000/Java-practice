import java.io.FileReader;
import java.io.FileNotFoundException;

class N1 {
    N1() throws FileNotFoundException {
        System.out.println("N1() start");        
        FileReader x = new FileReader("Bablu.txt");
        System.out.println("N1() end");        
    }
}

class N extends N1 {
    N() throws FileNotFoundException {
        super();
        
    }
    public static void main(String[] args) {
        System.out.println("main() start");        
        N a = new N();
        System.out.println("main() end");
    }
}
