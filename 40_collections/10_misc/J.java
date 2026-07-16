import java.util.TreeMap;
import java.util.SortedMap;

class J {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();

        map.put("umesh", 89);
        map.put("ratnesh", 67);
        map.put("prabhanjan", 72);
        map.put("lav", 81);
        map.put("kush", 75);

        System.out.println(map);

        // SortedMap<String,Integer> x = map.headMap("rav");
        // SortedMap<String,Integer> x = map.headMap("deepak");
        SortedMap<String,Integer> x = map.headMap("ratnesh");
        System.out.println(x);
    }
}
