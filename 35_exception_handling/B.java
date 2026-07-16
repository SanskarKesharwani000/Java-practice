import java.io.FileNotFoundException;
import java.io.IOException;

class B1 {
    void pro() throws IOException {
        System.out.println("Hello");
    }
}

class B extends B1 {
    void pro() throws FileNotFoundException {
        System.out.println("Hello");
    }  
}