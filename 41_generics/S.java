import java.util.ArrayList;

class S {
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
    }
}