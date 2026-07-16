import java.util.HashMap;

class C {
    public static void main(String[] args) {
        // HashMap map = new HashMap();
        //or
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("GGCT", 7);
        map.put("SRIT", 5);
        map.put("SRIT", 5);
        map.put("GLOBAL", 4);
        map.put("JEC", 9); 
        map.put("JEC", 9); 
        map.put("IIIT", 4); 

        System.out.println(map);
    }
}