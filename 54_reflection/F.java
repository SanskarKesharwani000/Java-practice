import java.lang.reflect.Field;

class F {
    public static void main(String[] args) {
        Class<FF> k = FF.class;

        Field[] arr = k.getFields();

        for(Field next : arr) {
            System.out.println(next);
        }
    }
}

class FF {
    int a;
    public int b;
}
