import java.lang.reflect.Field;

class H {
    public static void main(String[] args) {
        Class<HH> k = HH.class;
        
        Field[] arr = k.getFields();

        for(Field next : arr) {
            System.out.println(next.getName());
        }
    }
}

class HH {
    final public String a = "--";
    static public float b;
    transient public Integer c;
    private boolean d;
    protected char e;
    double f;
}