import java.util.ArrayList;

class V {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(45);
        x.add(32);
        x.add(56);
        x.add(12);
        x.add(23);

        System.out.println(x);
        System.out.println("Before: " + x.size());
        
        x.add(99);
        
        System.out.println(x);
        System.out.println("After: " + x.size());
    }    
}


// ArrayList can grow...