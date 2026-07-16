import java.lang.reflect.Method;

class L {
    public static void main(String[] args) {
        Class<LL> k = LL.class;

        Method[] arr = k.getDeclaredMethods();

        for(Method next : arr) {
            // System.out.println(next);
            System.out.println(next.getName());
        }
    }    
}

class LL1 {
    public int aaa(){ return 12; }
    float bbb() { return 2.3f; }
}

abstract class LL extends LL1 {
    final char x() { return 'A';}
    static public boolean y() throws ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException { return false; }
    private byte z() { return 23; }
    protected short t() { return 45; }
    abstract long m();
    public static void main(String[] args) {
        
    }
}
