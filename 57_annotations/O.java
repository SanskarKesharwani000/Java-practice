import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface OO {
    String name() default "yamraj";
    int age() default 1000;    
}

// @OO(name="aman", age=12)
// @OO 
@OO(name="Jaspreet")
class O {
    public static void main(String[] args) {
        Class<O> k = O.class;

        OO x = k.getAnnotation(OO.class);

        System.out.println(x.name());
        System.out.println(x.age());
    }
}
