import java.util.ArrayList;

class L {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("hitesh");
        x.add("ritesh");
        x.add("gitesh");
        x.add("mitesh");
        x.add("kitesh");
        String t = "vidyut";
        x.add(t);
        x.add("om" + "ji");

        for(String str : x) {
            System.out.println(str.toUpperCase());
        }

        System.out.println(x);
    }
}