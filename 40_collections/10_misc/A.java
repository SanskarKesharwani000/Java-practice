import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("golu");
        list.add("bholu");
        list.add("dholu");
        list.add("tolu");

        Object[] arr = list.toArray();

        for(Object next : arr)
            System.out.print(next + " ");
    }
}