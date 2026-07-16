import java.util.ArrayList;

class D {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(45);
        x.add(32);
        x.add(56);
        x.add(12);
        x.add(23);

        for(Integer next : x)
            System.out.println(x.remove(next)); 
    }    
}


// true
// Exception in thread "main" java.util.ConcurrentModificationException
//         at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
//         at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
//         at D.main(D.java:13)