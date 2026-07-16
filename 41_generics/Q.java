import java.util.ArrayList;

class Q {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        
        x.add(12);
        x.add(13);
        x.add(14);

        ArrayList<Float> y = new ArrayList<>();

        y.add(2.3f);
        y.add(7.5f);
        y.add(8.2f);
    
        process(x);
        process(y);
    }    

    static void process(ArrayList<Number> t) {
        System.out.println(t);
    }
}


// Q.java:17: error: incompatible types: ArrayList<Integer> cannot be converted to ArrayList<Number>
//         process(x);
//                 ^
// Q.java:18: error: incompatible types: ArrayList<Float> cannot be converted to ArrayList<Number>
//         process(y);
//                 ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors