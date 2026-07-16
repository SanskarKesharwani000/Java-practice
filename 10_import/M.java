// We can do static import in our file of  a variable which is marked static inside that class

import static java.lang.Math.PI;
import static java.lang.Math.E;
import static java.lang.Math.min;

class M {
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(E);

        int y = min(304, 120);

        System.out.println(y);
    }    
}