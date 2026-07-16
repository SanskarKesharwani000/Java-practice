import java.util.ArrayList;
import java.util.Iterator;

class O2 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("om");
        x.add("ram");
        x.add("shyam");
        x.add("ghanshyam");
        x.add("khatushyam");

        Iterator itr = x.iterator();

        while(itr.hasNext()) {
            System.out.println(((String)itr.next()).toUpperCase());
        }
    }
}