import java.util.ArrayList;

class S {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(4);
        x.add(5);
        x.add(9);
        x.add(2);
        x.add(7);

        System.out.println(x);
        Integer a = 3;
        System.out.println(x.remove(a));
        System.out.println(x);
    }
}