import java.util.ArrayList;

class T {
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

    static void process(ArrayList<? extends Number> t) {
        System.out.println(t);

        // t.add(12);
        // t.set(0, 12);
    }
}


// T.java:24: error: incompatible types: int cannot be converted to CAP#1
//         t.add(12);
//               ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Number from capture of ? extends Number
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error

// T.java:25: error: incompatible types: int cannot be converted to CAP#1
//         t.set(0, 12);
//                  ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Number from capture of ? extends Number
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error