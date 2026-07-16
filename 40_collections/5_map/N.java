import java.util.HashMap;

class N {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        map.put(12, "pradeep");
        map.put(45, "sudeep");
        map.put(null, "jagdeep");
        map.put(32, null);
        map.put(9, "randeep");
        map.put(78, "sudeep");
        
        System.out.println(map);
        map.put(null, "prakhar");
        System.out.println(map);
    }    
}
