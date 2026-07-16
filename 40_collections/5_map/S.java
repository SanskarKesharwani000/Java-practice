import java.util.HashMap;

class S {
    public static void main(String[] args) {
        HashMap<Student,Integer> map = new HashMap<Student,Integer>();

        map.put(new Student("om", 12), 78);
        map.put(new Student("ram", 9), 82);
        map.put(new Student("vikram", 15), 64);
        map.put(new Student("prabhat", 18), 92);
        map.put(new Student("vinod", 13), 57);
        
        
        Student x = new Student("vikram", 15);

        System.out.println(map);
        System.out.println(map.containsKey(x));
    }
}

