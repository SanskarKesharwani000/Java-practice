import java.util.ArrayList;

class K1 {
    public static void main(String[] args) {
        ArrayList<Number> x = new ArrayList<>(); 

        x.add(new Double(1.1e11));
        x.add(11);
        x.add((byte)111);
        x.add((short)1111);
        x.add(11111L);
        
        System.out.println(x.get(0));
        System.out.println(x.get(1));
        System.out.println(x.get(2));
        System.out.println(x.get(3));
        System.out.println(x.get(4));
    }    
}
