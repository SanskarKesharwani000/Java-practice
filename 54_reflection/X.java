import java.sql.Date;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class X {
    
    public X(StringBuffer a, Date b, boolean c) throws NullPointerException, IllegalArgumentException, IllegalStateException  {

    }

    public static void main(String[] args) {
        Class<X> k = X.class;

        Constructor c = k.getDeclaredConstructors()[0];

        System.out.print(Modifier.toString(c.getModifiers()) + " " + c.getName() + "(");
        
        Class[] ar = c.getParameterTypes();

        for(Class next : ar)
            System.out.print(next.getName() + ", ");

        System.out.print(")");

        Class[] r = c.getExceptionTypes();

        if(r.length > 0) {
            System.out.print(" throws ");
            for(Class next : r) 
                System.out.print(next.getName() + ", ");
        }
    }    
}
