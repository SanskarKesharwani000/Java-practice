import java.util.HashSet;
import java.util.Iterator;

class F2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(56);
        set.add(22);
        set.add(62);
        set.add(76);

        System.out.println(set);
        
        Iterator<Integer> itr = set.iterator();
        
        while(itr.hasNext())
            System.out.println(itr.next());
        
        // for(Integer next : set) 
        //     System.out.println(next);

        // NOT OK
        // for(int i=0;i<set.size();i++)
        //     System.out.println(set.get());
    }
}