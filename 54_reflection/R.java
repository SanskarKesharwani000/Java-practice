import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class R {
    public static final transient int abc = 90;
    
    public static void main(String[] args) {
        Class<R> k = R.class;

        Field field = k.getDeclaredFields()[0];

        System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getType().getName() + " " + field.getName());
    }
}
