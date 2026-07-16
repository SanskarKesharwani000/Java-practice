import java.lang.reflect.Field;

class I {
    public static void main(String[] args) {
        Class<II> k = II.class;

        Field[] arr = k.getFields();

        for(Field next : arr) {
            System.out.println(next);
        }
    }    
}

class II1 {
    public int a;
    float b;
}

class II extends II1 {
    public char x;
    boolean y;
}
