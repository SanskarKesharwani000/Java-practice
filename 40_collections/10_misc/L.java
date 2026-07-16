import java.util.TreeMap;

class L {
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

        // String x = map.ceilingKey("naman");
        // String x = map.ceilingKey("maneesh");
        String x = map.ceilingKey("yamraj");
        System.out.println(x);
    }
}
