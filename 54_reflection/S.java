import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;

class S {
    public final synchronized Integer process(String a, Date b, float c) throws ArithmeticException, NumberFormatException {
        return null;
    }    

    public static void main(String[] args) {
        Class<S> k = S.class;

        Method m = k.getDeclaredMethods()[1];

        System.out.println(Modifier.toString(m.getModifiers()) + " " + m.getReturnType().getName() + " " + m.getName());        
    }
}
