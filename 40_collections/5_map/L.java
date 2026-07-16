import java.util.HashMap;

class L {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        System.out.println(map.put("GGCT", 7));
        System.out.println(map.put("SRIT", 12));
        System.out.println(map.put("GLOBAL", 4));
        System.out.println(map.put("JEC", 3));
        System.out.println(map.put("IIITDM", 1));
        System.out.println(map);
        
        System.out.println(map.put("SRIT", 5));

        System.out.println(map);
    }
}
