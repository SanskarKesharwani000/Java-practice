import java.util.HashMap;

class B {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("GGCT", 7);
        map.put("SRIT", 5);
        map.put("GLOBAL", 4);
        map.put("JEC", 9);

        System.out.println(map);
    }
}