import java.lang.reflect.Modifier;

public abstract class P {
    public static void main(String[] args) {
        Class<PP1> k1 = PP1.class;
        Class<P> k2 = P.class;

        // System.out.println(k1.getModifiers());
        // System.out.println(k2.getModifiers());
        System.out.println(Modifier.toString(k1.getModifiers()));
        System.out.println(Modifier.toString(k2.getModifiers()));
    }
}

final class PP1 {

} 
