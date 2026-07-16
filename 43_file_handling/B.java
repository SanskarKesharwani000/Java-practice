import java.io.File;

class B {
    public static void main(String[] args) {
        File file = new File("golu.java");

        boolean flag = file.exists();

        System.out.println(flag);
    }
}