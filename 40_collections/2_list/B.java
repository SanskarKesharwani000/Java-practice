import java.util.ArrayList;

class B {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(45);
        x.add(32);
        x.add(56);
        x.add(12);
        x.add(23);

        for(int i=0;i<x.size();i++)
            System.out.println(x.remove(0)); 
    }    
}