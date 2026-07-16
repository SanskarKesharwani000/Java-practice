import java.util.Arrays;
import java.util.List;

class K {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("dablu", "gablu");
        List<Integer> list2 = Arrays.asList(12, 45, 67);
        List<Integer> list3 = Arrays.asList();
        Integer[] x = {34, 35, 36};
        List<Integer> list4 = Arrays.asList(x);
        List<Object> list5 = Arrays.asList(12, true, 34.56);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println(list5);
    }
}
