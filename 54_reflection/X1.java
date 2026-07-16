import java.sql.Date;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class X1 {

    static String onlyType(String type) {
        return type.substring(type.lastIndexOf(".")+1);
    }
    
    public X1(StringBuffer a, Date b, boolean c) throws NullPointerException, IllegalArgumentException, IllegalStateException  {

    }

    public static void main(String[] args) {
        Class<X1> k = X1.class;

        Constructor c = k.getDeclaredConstructors()[0];

        System.out.print(Modifier.toString(c.getModifiers()) + " " + c.getName() + "(");
        
        Class[] ar = c.getParameterTypes();

        for(Class next : ar)
            System.out.print(onlyType(next.getName()) + ", ");

        System.out.print(")");

        Class[] r = c.getExceptionTypes();

        if(r.length > 0) {
            System.out.print(" throws ");
            for(Class next : r) 
                System.out.print(onlyType(next.getName()) + ", ");
        }
    }    
}
