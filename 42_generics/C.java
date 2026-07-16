import java.util.ArrayList;
import java.util.List;

class C {
    public static void main(String[] args) {
        // ArrayList x1 = new ArrayList<Dog>();
        // ArrayList x2 = new ArrayList<Car>();
        // ArrayList x3 = new ArrayList<Integer>();
        // ArrayList x4 = new ArrayList<Object>();
        // ArrayList x5 = new ArrayList<List>();

        // ArrayList<? extends Object> x1 = new ArrayList<Dog>();
        // ArrayList<? extends Object> x2 = new ArrayList<Car>();
        // ArrayList<? extends Object> x3 = new ArrayList<Integer>();
        // ArrayList<? extends Object> x4 = new ArrayList<Object>();
        // ArrayList<? extends Object> x5 = new ArrayList<List>();

        ArrayList<?> x1 = new ArrayList<Dog>();
        ArrayList<?> x2 = new ArrayList<Car>();
        ArrayList<?> x3 = new ArrayList<Integer>();
        ArrayList<?> x4 = new ArrayList<Object>();
        ArrayList<?> x5 = new ArrayList<List>();

        // not ok
        // ArrayList<Object> x1 = new ArrayList<Dog>();
        // ArrayList<Object> x2 = new ArrayList<Car>();
        // ArrayList<Object> x3 = new ArrayList<Integer>();
        // ArrayList<Object> x4 = new ArrayList<Object>();
        // ArrayList<Object> x5 = new ArrayList<List>();
    }    
}
