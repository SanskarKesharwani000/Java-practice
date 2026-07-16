import java.util.ArrayList;

class M1 {
    public static void main(String[] args) {
        ArrayList<Double> x = new ArrayList<Double>();

        x.add(12);
        x.add("om");
        x.add(true);
        x.add(23.56);
        
        // the parameter of add method is Double typesafe so any values cannot be stored in it
        
        System.out.println(x);
    }
}

// ArrayList allows heterogeneous records...