import java.io.*;

class U2 implements Serializable {

}

final class U1 extends U2 /*implements Serializable, Cloneable*/ {
    // Early Initialization
    private final static U1 x = new U1();

    private U1() {
        if(x != null)
            throw new RuntimeException("You can't create another object of a singleton class...");
    }

    // @Override
    // public U1 clone() {
    //     //----
    // }

    private Object readResolve() {
        System.out.println("^^^");
        return x;
    }

    static U1 createObject() {
        return x;
    }
}

class U {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        U1 x1 = U1.createObject(); 
        U1 x2 = U1.createObject(); 
        U1 x3 = U1.createObject();
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x3 == x1);


        U1 y = x1.clone();

        System.out.println(x1 == y);
        System.out.println("------");
    }
}
