import java.io.FileNotFoundException;
import java.io.IOException;

class C1 {
    void pro() throws IOException {
        System.out.println("Hello");
    }
}

class C extends C1 {
    void pro() throws IOException {
        System.out.println("Hello");
    }  
}