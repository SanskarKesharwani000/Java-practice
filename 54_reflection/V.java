import java.sql.Date;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class V {
    
    public V(StringBuffer a, Date b, boolean c) throws NullPointerException, IllegalArgumentException  {

    }

    public static void main(String[] args) {
        Class<V> k = V.class;

        Constructor c = k.getDeclaredConstructors()[0];

        System.out.println(Modifier.toString(c.getModifiers()) + " " + c.getName());
    }    
}
