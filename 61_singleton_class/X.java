import java.io.*;

class X2 implements Serializable, Cloneable {
    public X2 clone() {
        X2 z = null;

        try {
            z = (X2)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return z;
    }
}

final class X1 extends X2 /*implements Serializable, Cloneable*/ {
    // Early Initialization
    private final static X1 x = new X1();

    private X1() {
        if(x != null)
            throw new RuntimeException("You can't create another object of a singleton class...");
    }

    @Override
    public X1 clone() {
        throw new RuntimeException("How dare you create another object...");
    }

    private Object readResolve() {
        System.out.println("^^^");
        return x;
    }

    static X1 createObject() {
        return x;
    }
}

class X {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        X1 x1 = X1.createObject(); 
        X1 x2 = X1.createObject(); 
        X1 x3 = X1.createObject();
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x3 == x1);

        X1 y = (X1)x1.clone();

        System.out.println(x1 == y);
        System.out.println("------");
    }
}
