import java.util.ArrayList;

class T {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(45);
        x.add(32);
        x.add(56);
        x.add(12);
        x.add(23);

        System.out.println("Before: ");
        System.out.println(x);
        System.out.println(x.size());
        System.out.println(x.remove(2));
        System.out.println("After: ");
        System.out.println(x);
        System.out.println(x.size());
    }    
}


// ArrayList can shrink...