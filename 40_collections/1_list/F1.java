import java.util.ArrayList;

class F1 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        
        // return type void
        x.add("mohan");
        x.add("rohan");
        x.add("sohan");
        x.add("gohan");
        x.add("tohan");

        System.out.println(x);

        System.out.println("++++++++++++++++");

        // System.out.println(x[0]);

        // get method is used for getting element at specified index.
        System.out.println(x.get(0));
        System.out.println(x.get(1));
        System.out.println(x.get(2));
        System.out.println(x.get(3));
        System.out.println(x.get(4));
    }    
}