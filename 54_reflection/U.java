import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;

class U {
    public final synchronized Integer process(String a, Date b, float c) throws ArithmeticException, NumberFormatException {
        return null;
    }    

    public static void main(String[] args) {
        Class<U> k = U.class;

        Method m = k.getDeclaredMethods()[1];

        // System.out.println(m);
        System.out.print(Modifier.toString(m.getModifiers()) + " " + m.getReturnType().getName() + " " + m.getName() + "(");        
    
        Class[] arr = m.getParameterTypes();

        for(Class next : arr) {
            System.out.print(next.getName()+", ");
        }

        System.out.print(") ");

        Class[] ar = m.getExceptionTypes();

        if(ar.length>0) {
            System.out.print("throws ");
            for(Class next : ar)
                System.out.print(next.getName()+", ");
        }
    }
}
