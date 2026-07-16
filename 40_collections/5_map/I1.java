import java.util.HashMap;

class I1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("GGCT", 'A');
        map.put("SRIT", true);
        map.put("GLOBAL", 4);
        map.put("JEC", "om");
        map.put("IIITDM", 12.45);

        System.out.println(map);
        
        // String str = map.get("JEC");
        //or
        String str = (String)map.get("JEC");

        System.out.println(str.toUpperCase());
    }
}


// I1.java:15: error: incompatible types: Object cannot be converted to String
//         String str = map.get("JEC");
//                             ^
// Note: I1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error