import java.lang.reflect.Constructor;

final class O1 {
    // Early Initialization
    private final static O1 x = new O1();

    private O1() {
        if(x != null)
            throw new RuntimeException("You can't create another object of a singleton class...");
    }

    static O1 createObject() {
        return x;
    }
}

class O {
    public static void main(String[] args) {
        O1 x1 = O1.createObject(); 
        O1 x2 = O1.createObject(); 
        O1 x3 = O1.createObject();
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x3 == x1);

        Class<O1> k = O1.class;

        Constructor[] arr = k.getDeclaredConstructors();

        arr[0].setAccessible(true);

        try {
            O1 y = (O1)arr[0].newInstance();
            System.out.println(x1 == y);
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("------");
    }
}
