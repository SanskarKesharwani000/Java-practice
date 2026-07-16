import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface CC {

}

@CC
class C {
    public static void main(String[] args) {
        Class<C> k = C.class;

        Annotation[] arr = k.getDeclaredAnnotations();

        for(Annotation next : arr)
            System.out.println(next);
    }    
}
