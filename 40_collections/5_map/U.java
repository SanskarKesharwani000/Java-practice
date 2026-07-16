import java.util.HashMap;

class U {
    public static void main(String[] args) {
        HashMap<Student1,Integer> map = new HashMap<Student1,Integer>();

        map.put(new Student1("om", 12), 78);
        map.put(new Student1("ram", 9), 82);
        map.put(new Student1("vikram", 15), 64);
        map.put(new Student1("prabhat", 18), 92);
        map.put(new Student1("vinod", 13), 57);
        
        
        Student1 x = new Student1("vikram", 15);

        System.out.println(map);
        System.out.println(map.containsKey(x));
    }
}

