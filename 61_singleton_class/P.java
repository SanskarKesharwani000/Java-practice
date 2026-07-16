import java.lang.reflect.Constructor;

// final class P1 {
enum P1 {
    OBJ
    
    // Early Initialization
    // private final static P1 x = new P1();

    // private P1() {
    //     if(x != null)
    //         throw new RuntimeException("You can't create another object of a singleton class...");
    // }

    // static P1 createObject() {
    //     return x;
    // }
}

class P {
    public static void main(String[] args) {
        P1 x1 = P1.OBJ;
        P1 x2 = P1.OBJ;
        P1 x3 = P1.OBJ;
        // P1 x4 = new P1(); //error: enum types may not be instantiated
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x3 == x1);

        Class<P1> k = P1.class;

        Constructor[] arr = k.getDeclaredConstructors();

        arr[0].setAccessible(true);

        try {
            P1 y = (P1)arr[0].newInstance();
            System.out.println(x1 == y);
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("------");
    }
}


// true
// true
// true
// java.lang.IllegalArgumentException: Cannot reflectively create enum objects
//         at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:492)
//         at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)
//         at P.main(P.java:38)
// ------