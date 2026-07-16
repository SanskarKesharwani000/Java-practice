import java.util.ArrayList;

class S {
    @SuppressWarnings("removal")
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");

        // @SuppressWarnings("removal")
        Integer y = new Integer(23);

        // @SuppressWarnings("removal")
        Float z = new Float(3.4);
    }       
}


// S.java:5: error: SuppressWarnings is not a repeatable annotation type
//     @SuppressWarnings("unchecked")
//     ^
// S.java:12: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer y = new Integer(23);
//                     ^
// S.java:15: warning: [removal] Float(double) in Float has been deprecated and marked for removal
//         Float z = new Float(3.4);
//                   ^
// Note: S.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
// 2 warnings