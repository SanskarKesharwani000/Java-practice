import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;

class T {
    public final synchronized Integer process(String a, Date b, float c) throws ArithmeticException, NumberFormatException {
        return null;
    }    

    public static void main(String[] args) {
        Class<T> k = T.class;

        Method m = k.getDeclaredMethods()[1];

        // System.out.println(m);
        System.out.print(Modifier.toString(m.getModifiers()) + " " + m.getReturnType().getName() + " " + m.getName() + "(");        
    
        Class[] arr = m.getParameterTypes();

        for(Class next : arr) {
            System.out.print(next.getName()+", ");
        }

        System.out.print(") ");
    }
}
