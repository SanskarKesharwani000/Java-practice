import java.io.FileNotFoundException;
import java.io.IOException;

class X {
    public static void main(String[] args) throws FileNotFoundException {
        throw new IOException();
    }    
}


// IOException  (Parent)
//     ^ 
//     |
// FileNotFoundException (Child)

// FileNotFoundException x = new IOException();  // not ok
