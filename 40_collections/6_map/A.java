import java.util.LinkedHashMap;
import java.util.HashMap;

class A {
    public static void main(String[] args) {
        // HashMap<Integer,String> map = new HashMap<Integer,String>();
        LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();

        map.put(12, "pradeep");
        map.put(45, "sudeep");
        map.put(9, "randeep");
        map.put(78, "kuldeep");
        map.put(39, "prabhjeet");
        
        System.out.println(map);
    }    
}
