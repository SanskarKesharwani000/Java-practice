import java.lang.reflect.Field;

class G {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<GG> k1 = GG.class;
        Class k2 = new GG().getClass();
        Class k3 = Class.forName("GG");

        System.out.println(k1 == k2);
        System.out.println(k3 == k2);
        System.out.println(k3 == k1);
    }
}

class GG {
    
}
