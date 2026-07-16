import java.io.*;

class F {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Console x = System.console();        

        Console y = x.clone();
    }    
}


// F.java:7: error: clone() has protected access in Object
//         Console y = x.clone();
//                      ^
// F.java:7: error: incompatible types: Object cannot be converted to Console
//         Console y = x.clone();
//                            ^
// 2 errors