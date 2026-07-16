import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MM {
    int a();
    String b();
}

@MM(a=23, b="om")
class M {
    public static void main(String[] args) {
        Class<M> k = M.class;

        MM x = k.getAnnotation(MM.class);

        int val = x.a();

        System.out.println(val);
        System.out.println(x.b());
    }
}
