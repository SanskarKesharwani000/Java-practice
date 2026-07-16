import java.io.*;

class S2 implements Serializable {

}

final class S1 extends S2 /*implements Serializable*/ {
    // Early Initialization
    private final static S1 x = new S1();

    private S1() {
        if(x != null)
            throw new RuntimeException("You can't create another object of a singleton class...");
    }

    static S1 createObject() {
        return x;
    }
}

class S {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        S1 x1 = S1.createObject(); 
        S1 x2 = S1.createObject(); 
        S1 x3 = S1.createObject();
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x3 == x1);

        new ObjectOutputStream(new FileOutputStream("golu.txt")).writeObject(x1);

        S1 y = (S1)(new ObjectInputStream(new FileInputStream("golu.txt")).readObject());

        System.out.println(x1 == y);
        System.out.println("------");
    }
}
