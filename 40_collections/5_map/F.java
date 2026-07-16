import java.util.HashMap;

class F {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("GGCT", 7);
        map.put("SRIT", 5);
        map.put("GLOBAL", "om");
        map.put("JEC", 9);
        map.put("IIITDM", 9.2);

        System.out.println(map);
    }
}


// F.java:9: error: incompatible types: String cannot be converted to Integer
//         map.put("GLOBAL", "om");
//                           ^
// F.java:11: error: incompatible types: double cannot be converted to Integer
//         map.put("IIITDM", 9.2);
//                           ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors
