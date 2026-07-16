import java.util.ArrayList;
import java.util.Iterator;

class O3 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("om");
        x.add("ram");
        x.add("shyam");
        x.add("ghanshyam");
        x.add("khatushyam");

        Iterator itr = x.iterator();

        while(itr.hasNext()) {
            String str = (String)itr.next();
            System.out.println(str.toUpperCase());
        }
    }
}