import java.util.HashMap;

class P {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        map.put(12, "pradeep");
        map.put(45, "sudeep");
        map.put(25, "jagdeep");
        map.put(32, "pranav");
        map.put(9, "randeep");
        map.put(78, "sudeep");
        
        System.out.println(map);
        System.out.println(map.containsValue("yamraj"));
        System.out.println(map.containsValue("jagdeep"));
    }    
}
