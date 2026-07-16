import java.util.ArrayList;

class E {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(45);
        x.add(32);
        x.add(56);
        x.add(12);
        x.add(23);

        for(int i=x.size()-1;i>=0;i--)
            System.out.println(x.remove(i)); 
    }    
}