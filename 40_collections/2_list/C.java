import java.util.ArrayList;

class C {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(45);
        x.add(32);
        x.add(56);
        x.add(12);
        x.add(23);

        int size = x.size();
        for(int i=0;i<size;i++)
            System.out.println(x.remove(0)); 
    }    
}