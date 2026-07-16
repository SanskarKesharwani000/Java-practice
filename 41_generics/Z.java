import java.util.ArrayList;

class Z {
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
        // Integer x = t.get(0);
        // Float x = t.get(0);
        Number x = t.get(0);
        // Object x = t.get(0);
    }
}