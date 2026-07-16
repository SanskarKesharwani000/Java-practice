import java.util.HashMap;

class E {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("GGCT", 7);
        map.put("SRIT", 5);
        map.put(true, 4);
        map.put("JEC", 9);
        map.put(23.45, 9);

        System.out.println(map);
    }
}


// E.java:9: error: incompatible types: boolean cannot be converted to String
//         map.put(true, 4);
//                 ^
// E.java:11: error: incompatible types: double cannot be converted to String
//         map.put(23.45, 9);
//                 ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors