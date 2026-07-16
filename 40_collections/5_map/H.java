import java.util.HashMap;

class H {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("GGCT", 7);
        map.put("SRIT", 5);
        map.put("GLOBAL", 4);
        map.put("JEC", 9);
        map.put("IIITDM", 1);

        System.out.println(map);
        System.out.println(map.remove("IIITDM"));
        // System.out.println(map.remove("SRJT"));
        System.out.println(map);
    }
}