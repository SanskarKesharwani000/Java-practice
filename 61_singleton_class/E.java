import java.io.*;

class E {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Console x = System.console();        

        System.out.println(x instanceof Cloneable);
    }    
}
