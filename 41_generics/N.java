import java.util.ArrayList;

class N {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        
        x.add("om");
        x.add(true);
        x.add(45.56);

        process(x);

        x.add(new Car());
    }   

    static void process(ArrayList<Integer> z) {
        // z.add("mohan");
        z.add(23);

        System.out.println(z);
    }
}

class Car {

}
