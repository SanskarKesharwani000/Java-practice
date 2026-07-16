import java.util.ArrayList;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String> {
    public void accept(String str) {
        System.out.println(str + " ~");
    }
}

class O {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Yudhishthir");
        list.add("Bheem");
        list.add("Arjun");
        list.add("Nakul");
        list.add("Sahdev");

        // for(int i=0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }

        // for(String next : list) {
        //     System.out.println(next + " -");
        // }

        Consumer<String> consumer = new ConsumerImpl();
        list.forEach(consumer);
    }    
}
