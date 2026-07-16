import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class F1 {
    void pro() throws EOFException {
        System.out.println("Hello");
    }
}

class F extends F1 {
    void pro() throws FileNotFoundException {
        System.out.println("Hello");
    }  
}