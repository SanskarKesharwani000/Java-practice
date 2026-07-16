import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface RR {
    // Integer[] marks();
    String[] records();
}

// @RR(records={"A","B","C","D"})
@RR({"A","B","C","D"})
class R {
    public static void main(String[] args) {
        Class<R> k = R.class;

        RR x = k.getAnnotation(RR.class);

        String[] arr = x.records();

        for(String next : arr)
            System.out.println(next);
    }
}


// R.java:11: error: cannot find symbol
// @RR({"A","B","C","D"})
//     ^
//   symbol:   method value()
//   location: @interface RR
// R.java:11: error: annotation @RR is missing a default value for the element 'records'
// @RR({"A","B","C","D"})
// ^
// 2 errors