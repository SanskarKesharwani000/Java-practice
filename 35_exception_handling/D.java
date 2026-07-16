import java.io.FileNotFoundException;
import java.io.IOException;

class D1 {
    void pro() throws IOException {
        System.out.println("Hello");
    }
}

class D extends D1 {
    void pro() {
        System.out.println("Hello");
    }  
}