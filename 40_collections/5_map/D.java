import java.util.HashMap;

class D {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        System.out.println(map.isEmpty());
        System.out.println(map.size());
        
        map.put("GGCT", 7);
        map.put("SRIT", 5);
        map.put("GLOBAL", 4);
        map.put("JEC", 9);
        map.put("IIIT", 1);
        
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
    }
}