import java.util.ArrayList;

class R {
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

    static void process(ArrayList<Integer> t1) {
        System.out.println(t);
    }

    static void process(ArrayList<Float> t2) {
        System.out.println(t);
    }
}



// R.java:25: error: name clash: process(ArrayList<Float>) and process(ArrayList<Integer>) have the same erasure
//     static void process(ArrayList<Float> t2) {
//                 ^
// R.java:22: error: cannot find symbol
//         System.out.println(t);
//                            ^
//   symbol:   variable t
//   location: class R
// R.java:26: error: cannot find symbol
//         System.out.println(t);
//                            ^
//   symbol:   variable t
//   location: class R
// 3 errors
