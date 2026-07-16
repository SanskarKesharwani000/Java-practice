import java.util.ArrayList;

class U {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(78);
        x.add(45);
        x.add(32);
        x.add(56);
        x.add(45);
        x.add(12);
        x.add(23);

        System.out.println(x);
        x.remove(Integer.valueOf(45));
        System.out.println(x);
    }    
}
