import java.util.TreeMap;

class I {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();

        map.put("umesh", 89);
        map.put("ratnesh", 67);
        map.put("prabhanjan", 72);
        map.put("lav", 81);
        map.put("kush", 75);

        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
    }
}
