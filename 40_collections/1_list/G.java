import java.util.ArrayList;

class G {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("hitesh");
        x.add("ritesh");
        x.add("gitesh");
        x.add("mitesh");
        x.add("kitesh");

        // classic for loop for accessing every element
        for(int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
        }
    }
}
