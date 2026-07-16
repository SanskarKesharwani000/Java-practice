import java.util.HashMap;

class J1 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();

        map.put("GGCT", "A");
        map.put("SRIT", "true");
        map.put("GLOBAL", "4");
        map.put("JEC", "om");
        map.put("IIITDM", "12.45");

        System.out.println(map);
        
        String str = map.get("SRIT");
        //or
        // Integer str = map.get("SRIT");

        System.out.println(str.toUpperCase());
    }
}
