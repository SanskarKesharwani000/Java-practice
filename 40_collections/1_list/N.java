import java.util.ArrayList;

class N {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(103);
        x.add(34);
        x.add(97);
        x.add(453);

        // since object is returned so it cannot be directly stored in the Integer without typecasting
        Integer q = x.get(0);
    }
}



// N.java:12: error: incompatible types: Object cannot be converted to Integer
//         Integer q = x.get(0);
//                          ^
// Note: N.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
