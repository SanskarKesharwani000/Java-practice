import java.util.ArrayList;

class C {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("golu");
        list.add("bholu");
        list.add("dholu");
        list.add("tolu");

        // Object[] arr = list.toArray();
        String[] arr1 = new String[list.size()];
        String[] arr2 = list.toArray(arr1);

        for(String next : arr2)
            System.out.print(next.toUpperCase() + " ");
    }
}