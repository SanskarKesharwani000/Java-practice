import java.io.FileNotFoundException;
import java.io.IOException;

class A1 {
    void pro() throws FileNotFoundException {
        System.out.println("Hello");
    }
}

class A extends A1 {
    void pro() throws IOException {
        System.out.println("Hello");
    }  
}


// A.java:11: error: pro() in A cannot override pro() in A1
//     void pro() throws IOException {
//          ^
//   overridden method does not throw IOException
// 1 error