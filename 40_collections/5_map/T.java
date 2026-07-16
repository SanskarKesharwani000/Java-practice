import java.util.HashMap;

class T {
    public static void main(String[] args) {
        HashMap<Student1,Integer> map = new HashMap<Student1,Integer>();

        map.put(new Student1("om", 12), 78);
        map.put(new Student1("ram", 9), 82);
        map.put(new Student1("vikram", 15), 64);
        map.put(new Student1("prabhat", 18), 92);
        map.put(new Student1("vinod", 13), 57);
        
        System.out.println(map);
        map.put(new Student1("vikram", 15), 72);
        System.out.println(map);
    }
}

