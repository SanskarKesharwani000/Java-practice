import java.util.ArrayList;

class M {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        
        x.add(99);
        x.add(89);
        x.add(79);

        process(x);
    }   
    
    static void process(ArrayList z) {
        System.out.println(z);

        z.add(true);
        z.add("mohan");
        
        System.out.println(z);
    }
}
