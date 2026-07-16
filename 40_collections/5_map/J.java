import java.util.HashMap;

class J {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();

        map.put("GGCT", "A");
        map.put("SRIT", "true");
        map.put("GLOBAL", "4");
        map.put("JEC", "om");
        map.put("IIITDM", "12.45");

        System.out.println(map);
        System.out.println(map.get("JEC").toUpperCase());
    }
}
