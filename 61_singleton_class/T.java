import java.io.*;

class T2 implements Serializable {

}

final class T1 extends T2 /*implements Serializable*/ {
    // Early Initialization
    private final static T1 x = new T1();

    private T1() {
        if(x != null)
            throw new RuntimeException("You can't create another object of a singleton class...");
    }

    private Object readResolve() {
        System.out.println("^^^");
        return x;
    }

    static T1 createObject() {
        return x;
    }
}

class T {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        T1 x1 = T1.createObject(); 
        T1 x2 = T1.createObject(); 
        T1 x3 = T1.createObject();
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x3 == x1);

        new ObjectOutputStream(new FileOutputStream("golu.txt")).writeObject(x1);

        T1 y = (T1)(new ObjectInputStream(new FileInputStream("golu.txt")).readObject());

        System.out.println(x1 == y);
        System.out.println("------");
    }
}
