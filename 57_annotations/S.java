import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface SS {
    String[] value();
}

// @SS(value={"A","B","C","D"})
@SS({"A","B","C","D"})
class S {
    public static void main(String[] args) {
        Class<S> k = S.class;

        SS x = k.getAnnotation(SS.class);

        String[] arr = x.value();

        for(String next : arr)
            System.out.println(next);
    }
}