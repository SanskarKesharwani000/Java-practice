import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface QQ {
    // Integer[] marks();
    String[] value();
}

@QQ(value={"A","B","C"})
class Q {
    public static void main(String[] args) {
        Class<Q> k = Q.class;

        QQ x = k.getAnnotation(QQ.class);

        String[] arr = x.value();

        for(String next : arr)
            System.out.println(next);
    }
}
