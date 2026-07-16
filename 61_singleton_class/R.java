import java.io.*;

final class R1 {
    // Early Initialization
    private final static R1 x = new R1();

    private R1() {
        if(x != null)
            throw new RuntimeException("You can't create another object of a singleton class...");
    }

    static R1 createObject() {
        return x;
    }
}

class R {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        R1 x1 = R1.createRbject(); 
        R1 x2 = R1.createRbject(); 
        R1 x3 = R1.createRbject();
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x3 == x1);

        new ObjectOutputStream(new FileOutputStream("golu.txt")).writeObject(x1);

        R1 y = (R1)(new ObjectInputStream(new FileInputStream("golu.txt")).readObject());

        System.out.println(x1 == y);
        System.out.println("------");
    }
}



// true
// true
// true
// Exception in thread "main" java.io.NotSerializableException: R1
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1197)
//         at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:354)
//         at R.main(R.java:27)
