import java.io.*;

class D {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Console x = System.console();

        new ObjectOutputStream(new FileOutputStream("golu.txt")).writeObject(x);

        System.out.println("++++++++++++++++++++");

        Console y = (Console)(new ObjectInputStream(new FileInputStream("golu.txt")).readObject());

        System.out.println(x == y);
    }    
}


// Exception in thread "main" java.io.NotSerializableException: java.io.Console
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1197)
//         at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:354)
//         at D.main(D.java:7)

