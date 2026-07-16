import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface XYZ {

}

@XYZ
class FF {

}

class F extends FF {
    public static void main(String[] args) {
        Class<F> k = F.class;

        Annotation[] arr = k.getAnnotations();

        for(Annotation next : arr) 
            System.out.println(next);
    }
}


// <blank>