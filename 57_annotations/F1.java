import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface XYZ1 {

}

@XYZ1
class FF1 {

}

class F1 extends FF1 {
    public static void main(String[] args) {
        Class<F1> k = F1.class;

        // Annotation[] arr = k.getDeclaredAnnotations();
        Annotation[] arr = k.getAnnotations();

        for(Annotation next : arr) 
            System.out.println(next);
    }
}