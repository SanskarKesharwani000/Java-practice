import java.lang.reflect.Method;

class K {
    public static void main(String[] args) {
        Class<KK> k = KK.class;

        Method[] arr = k.getMethods();

        for(Method next : arr) {
            System.out.println(next);
        }
    }    
}

class KK1 {
    public int aaa(){ return 12; }
    float bbb() { return 2.3f; }
}

abstract class KK extends KK1 {
    final char x() { return 'A';}
    static public boolean y() throws ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException { return false; }
    private byte z() { return 23; }
    protected short t() { return 45; }
    abstract long m();
}
