import java.io.IOException;

class D1 {
    public static void main(String[] args) {
        throw new IOException();        
    }    
}


// T1.java:5: error: unreported exception IOException; must be caught or declared to be thrown
//         throw new IOException();
//         ^
// 1 error