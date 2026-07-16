import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface GG1 {

}

@Retention(RetentionPolicy.RUNTIME)
@interface GG2 {

}

@GG1
@GG2
class G {
    public static void main(String[] args) {
        Class<G> k = G.class;
        
        GG2 ano = k.getAnnotation(GG2.class);

        System.out.println(ano);
    }    
}
