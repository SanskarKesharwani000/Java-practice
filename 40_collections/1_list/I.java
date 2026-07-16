import java.util.ArrayList;

// In this every record is stored in variable of typesafety Object because nothing is defined in typesafety.

class I {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("hitesh");
        x.add("ritesh");
        x.add("gitesh");
        x.add("mitesh");
        x.add("kitesh");
        x.add("yamraj");

        for(Object str : x) {
            System.out.println(str);
        }
    }
}