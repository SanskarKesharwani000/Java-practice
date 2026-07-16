import java.util.ArrayList;
import java.util.Iterator;

class O4 {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("om");
        x.add("ram");
        x.add("shyam");
        x.add("ghanshyam");
        x.add("khatushyam");
        x.add("yamraj");

        Iterator<String> itr = x.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next().toUpperCase());
        }
    }
}