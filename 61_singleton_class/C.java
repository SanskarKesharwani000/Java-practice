import java.io.Console;
import java.lang.reflect.Constructor;

class C {
    public static void main(String[] args) {
        Console x = System.console();

        Class<Console> k = Console.class;

        Constructor[] arr = k.getDeclaredConstructors();

        try {
            arr[0].setAccessible(true);
            Console y = (Console)arr[0].newInstance();

            System.out.println(x == y);    
        } catch(Exception e) {
            e.printStackTrace();
        }
    }    
}


// java.lang.reflect.InaccessibleObjectException: Unable to make private java.io.Console() accessible: module java.base does not "opens java.io" to unnamed module @4dd8dc3
//         at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:354)
//         at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:297)
//         at java.base/java.lang.reflect.Constructor.checkCanSetAccessible(Constructor.java:188)
//         at java.base/java.lang.reflect.Constructor.setAccessible(Constructor.java:181)
//         at C.main(C.java:13)
