import java.io.File;

class J {
    public static void main(String[] args) {
        File file = new File("Dholakpur");

        boolean flag = file.mkdir();

        System.out.println("Folder Created: " + flag);
    }    
}
