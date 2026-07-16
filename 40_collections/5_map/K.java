import java.util.HashMap;

class K {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("GGCT", 7);
        map.put("SRIT", 12);
        map.put("GLOBAL", 4);
        map.put("JEC", 3);
        map.put("IIITDM", 1);
        System.out.println(map);
        
        map.put("SRIT", 5);
        System.out.println(map);
        
    }
}
