import java.io.File;

class R {
    public static void main(String[] args) {
        File file = new File("D:/STS/backup");  // A non-empty folder...

        boolean flag = file.delete();
    
        System.out.println("The File is deleted: " + flag);
    }    
}
