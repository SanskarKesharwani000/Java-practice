import java.util.ArrayList;

class X {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(2);
        x.add(5);
        x.add(9);

        System.out.println(x);

        // x.add(1, 3);
        x.set(1, 3);

        System.out.println(x);
    }    
}
