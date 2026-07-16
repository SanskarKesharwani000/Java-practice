import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.*;


@Retention(RUNTIME)
@interface EE1 {

}

@Retention(RUNTIME)
@interface EE2 {

}

@Retention(RUNTIME)
@interface EE3 {

}

@EE1
@EE2
@EE3
class E {
    public static void main(String[] args) {
        Class<E> k = E.class;

        Annotation[] arr = k.getDeclaredAnnotations();

        for(Annotation next : arr) 
            System.out.println(next);
    }    
}
