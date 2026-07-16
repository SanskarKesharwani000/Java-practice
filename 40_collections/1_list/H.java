import java.util.ArrayList;

class H {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("hitesh");
        x.add("ritesh");
        x.add("gitesh");
        x.add("mitesh");
        x.add("kitesh");

        // If typesafety is not defined then the value saved in ArrayList is of type Object and is saved using autoboxing or polymorphic assignment.
        for(String str : x) {
            System.out.println(str);
        }
    }
}


// H.java:13: error: incompatible types: Object cannot be converted to String
//         for(String str : x) {
//                          ^
// Note: H.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
