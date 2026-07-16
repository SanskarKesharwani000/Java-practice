import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class G1 {
    void pro() throws IOException {
        System.out.println("Hello");
    }
}

class G extends G1 {
    void pro() throws EOFException, FileNotFoundException {
        System.out.println("Hello");
    }  
}