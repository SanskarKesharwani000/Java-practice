import java.util.ArrayList;
import java.util.Iterator;

class O {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("om");
        x.add("ram");
        x.add("shyam");
        x.add("ghanshyam");
        x.add("khatushyam");

        Iterator itr = x.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
