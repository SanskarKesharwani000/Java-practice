import java.util.HashMap;

class W {
    public static void main(String[] args) {
        HashMap<Student1,College> map = new HashMap<Student1,College>();

        map.put(new Student1("om", 12), new College("GGCT"));
        map.put(new Student1("ram", 9), new College("JEC"));
        map.put(new Student1("vikram", 15), new College("SRIT"));
        map.put(new Student1("prabhat", 18), new College("JEC"));
        map.put(new Student1("vinod", 13), new College("Global"));
        
        
        Student1 x = new Student1("vikram", 15);
        College y = new College("JEC");

        System.out.println(map);
        System.out.println(map.containsKey(x));
        System.out.println(map.containsValue(y));
        System.out.println(map);
    }
}

