import java.util.ArrayList;

class N1 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(103);
        x.add(34);
        x.add(97);
        x.add(453);

        // by typecasting we can get object of Integer from ArrayList
        Integer q = (Integer)x.get(0);

        System.out.println(q);
    }
}