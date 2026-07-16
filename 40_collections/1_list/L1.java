import java.util.ArrayList;

class L1 {
    public static void main(String[] args) {    
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(78);
        x.add(234);
        x.add(67);
        x.add(23);
        x.add(39);

        // By typesafety they are Integer variables and Integer Objects
        for(Integer next : x) {
            System.out.println(next);
        }
    }
}
