import java.io.File;

class D {
    public static void main(String[] args) {
        File file = new File("golu");

        boolean flag1 = file.isDirectory();
        boolean flag2 = file.isFile();

        System.out.println("Is a Directory: " + flag1);
        System.out.println("Is a File: " + flag2);
    }
}