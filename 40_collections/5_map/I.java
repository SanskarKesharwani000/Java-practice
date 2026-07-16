import java.util.HashMap;

class I {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("GGCT", 'A');
        map.put("SRIT", true);
        map.put("GLOBAL", 4);
        map.put("JEC", "om");
        map.put("IIITDM", 12.45);

        System.out.println(map);
        System.out.println(map.get("JEC").toUpperCase());
    }
}



// I.java:14: error: cannot find symbol
//         System.out.println(map.get("JEC").toUpperCase());
//                                          ^
//   symbol:   method toUpperCase()
//   location: class Object
// Note: I.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error