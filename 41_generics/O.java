import java.util.ArrayList;

class O {
    public static void main(String[] args) {
        ArrayList<Integer> x = process();
    
        System.out.println(x);
    }    

    static ArrayList process() {
        ArrayList x = new ArrayList();

        x.add(true);
        x.add(34);
        x.add("om");

        return x;
    }
}
