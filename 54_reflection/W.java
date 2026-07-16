import java.sql.Date;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class W {
    
    public W(StringBuffer a, Date b, boolean c) throws NullPointerException, IllegalArgumentException  {

    }

    public static void main(String[] args) {
        Class<W> k = W.class;

        Constructor c = k.getDeclaredConstructors()[0];

        System.out.print(Modifier.toString(c.getModifiers()) + " " + c.getName() + "(");
        
        Class[] ar = c.getParameterTypes();

        for(Class next : ar)
            System.out.print(next.getName() + ", ");

        System.out.print(")");
    }    
}
