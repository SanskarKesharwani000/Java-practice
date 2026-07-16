import java.util.Arrays;

class C {
    public static void main(String[] args) {
        String[] x = {"jay","tinku","vijay","abhay","deepak","kamal"};

        for(String next : x)
            System.out.print(next + " ");

        Arrays.sort(x);
        System.out.println();

        for(String next : x)
            System.out.print(next + " ");
    }    
}
