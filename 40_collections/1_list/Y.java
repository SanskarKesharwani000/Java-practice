import java.util.ArrayList;

class Y {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(2);
        x.add(5);
        x.add(9);

        System.out.println(x);

        // System.out.println(x.add(1, 3)); // not ok : void return type
        System.out.println(x.set(1, 3));

        System.out.println(x);
    }    
}
