import java.io.File;

class O {
    public static void main(String[] args) {
        File file = new File("E:/MOVIES");

        System.out.println(file.exists());
        System.out.println(file.isDirectory());
    }
}
