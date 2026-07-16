import java.util.ArrayList;

class P {
    public static void main(String[] args) {
        ArrayList x = process();

        x.add(true);
        x.add(23);

        System.out.println(x);
    }

    static ArrayList<String> process() {
        ArrayList<String> list = new ArrayList<>();

        list.add("om");
        list.add("ram");
        list.add("shyam");

        return list;
    }
}
