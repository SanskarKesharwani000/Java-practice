import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class E1 {
    void pro() throws EOFException, FileNotFoundException {
        System.out.println("Hello");
    }
}

class E extends E1 {
    void pro() throws FileNotFoundException {
        System.out.println("Hello");
    }  
}