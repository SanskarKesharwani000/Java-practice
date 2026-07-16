import java.lang.reflect.Field;

class J {
    public static void main(String[] args) {
        Class<JJ> k = JJ.class;

        Field[] arr = k.getDeclaredFields();

        for(Field next : arr) {
            System.out.println(next);
        }
    }    
}

class JJ1 {
    public int a;
    float b;
}

class JJ extends JJ1 {
    final public char x = 'A';
    static boolean y;
    private boolean z;
    protected short t;
    transient long m;
}
