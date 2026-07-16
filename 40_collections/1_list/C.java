import java.util.ArrayList;

class C {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list);
        
        // to add element it is unsafe operation because of typesafety
        list.add(67);
        list.add(59);
        list.add(43);

        System.out.println("########################");

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list);
    }    
}
