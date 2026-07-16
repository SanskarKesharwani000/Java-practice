import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class Z {
    public static void main(String[] args) throws IOException {
        if(12 < 13) {
            throw new FileNotFoundException();
        }

        throw new EOFException();
    }    
}
