import java.util.ArrayList;

class E {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        
        x.add("mohan");
        x.add("rohan");
        x.add("sohan");
        x.add("gohan");
        x.add("tohan");

        System.out.println(x);

        // String str = new String("sohan");
        //or
        // contains method checks whether the element is present or not
        String str = new String("eohan");

        // contains method return true.
        System.out.println(x.contains(str));
    }    
}
