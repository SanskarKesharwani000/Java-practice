import java.util.TreeMap;
import java.util.SortedMap;

class K {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();

        map.put("umesh", 89);
        map.put("ratnesh", 67);
        map.put("prabhanjan", 72);
        map.put("geeta", 98);
        map.put("lav", 81);
        map.put("kush", 75);
        map.put("maneesh", 91);

        System.out.println(map);

        // SortedMap<String,Integer> x = map.tailMap("hitesh");
        SortedMap<String,Integer> x = map.tailMap("yamraj");
        System.out.println(x);
    }
}
