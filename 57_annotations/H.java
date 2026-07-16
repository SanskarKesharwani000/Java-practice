import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// @Target(ElementType.TYPE)
// @Target({ElementType.TYPE,ElementType.CONSTRUCTOR})
// @Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.METHOD})
// @Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.FIELD})
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.FIELD,ElementType.LOCAL_VARIABLE})
@interface HH {

}

@HH
class H {
    @HH
    int a;
    
    @HH
    static float y;

    @HH
    void pro() { }
    
    @HH
    static void info() { 
        @HH
        boolean flag = true;
    }

    @HH
    H() { }
}
