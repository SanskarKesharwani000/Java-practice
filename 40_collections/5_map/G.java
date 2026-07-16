import java.util.HashMap;

class G {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("GGCT", 7);
        map.put("SRIT", 5);
        map.put("GLOBAL", 4);
        map.put("JEC", 9);
        map.put("IIITDM", 1);

        System.out.println(map);
        // System.out.println(map.get("SRIT"));
        System.out.println(map.get("SRJT"));
        System.out.println(map);
    }
}