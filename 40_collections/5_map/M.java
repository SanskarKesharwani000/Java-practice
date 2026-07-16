import java.util.HashMap;

class M {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        map.put(12, "pradeep");
        map.put(45, "sudeep");
        map.put(null, "jagdeep");
        map.put(32, null);
        map.put(9, "randeep");

        System.out.println(map);
    }    
}
