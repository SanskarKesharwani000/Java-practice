import java.io.*;

class W2 implements Serializable, Cloneable {
    public W2 clone() {
        W2 z = null;

        try {
            z = (W2)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return z;
    }
}

final class W1 extends W2 /*implements Serializable, Cloneable*/ {
    // Early Initialization
    private final static W1 x = new W1();

    private W1() {
        if(x != null)
            throw new RuntimeException("You can't create another object of a singleton class...");
    }

    @Override
    public W1 clone() {
        return x;
    }

    private Object readResolve() {
        System.out.println("^^^");
        return x;
    }

    static W1 createObject() {
        return x;
    }
}

class W {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        W1 x1 = W1.createObject(); 
        W1 x2 = W1.createObject(); 
        W1 x3 = W1.createObject();
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x3 == x1);

        W1 y = (W1)x1.clone();

        System.out.println(x1 == y);
        System.out.println("------");
    }
}
