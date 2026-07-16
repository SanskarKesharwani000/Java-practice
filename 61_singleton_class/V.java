import java.io.*;

class V2 implements Serializable, Cloneable {
    public V2 clone() {
        V2 z = null;

        try {
            z = (V2)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return z;
    }
}

final class V1 extends V2 /*implements Serializable, Cloneable*/ {
    // Early Initialization
    private final static V1 x = new V1();

    private V1() {
        if(x != null)
            throw new RuntimeException("You can't create another object of a singleton class...");
    }

    // @Override
    // public V1 clone() {
    //     //----
    // }

    private Object readResolve() {
        System.out.println("^^^");
        return x;
    }

    static V1 createObject() {
        return x;
    }
}

class V {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        V1 x1 = V1.createObject(); 
        V1 x2 = V1.createObject(); 
        V1 x3 = V1.createObject();
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x3 == x1);


        V1 y = (V1)x1.clone();

        System.out.println(x1 == y);
        System.out.println("------");
    }
}
