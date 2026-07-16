import java.lang.annotation.Annotation;

@interface BB {

}

@BB
class B {
    public static void main(String[] args) {
        Class<B> k = B.class;

        Annotation[] arr = k.getDeclaredAnnotations();

        for(Annotation next : arr)
            System.out.println(next);
    }    
}


// <blank>