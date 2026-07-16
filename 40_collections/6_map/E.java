import java.util.TreeMap;

class E {
    public static void main(String[] args) {
        TreeMap<Student1,Integer> map = new TreeMap<Student1,Integer>();

        map.put(new Student1("bheem", 32), 68);
        map.put(new Student1("yudhishthir", 35), 89);
        map.put(new Student1("nakul", 30), 78);
        map.put(new Student1("arjun", 31), 99);
        map.put(new Student1("sahdev", 29), 75);
        map.put(new Student1("karn", 37), 100);

        System.out.println(map);
    }
}
