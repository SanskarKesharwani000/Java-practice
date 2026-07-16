import java.io.File;

class Q {
    public static void main(String[] args) {
        File file = new File("Shambhavi_Kriya.mp4");

        boolean flag = file.delete();
    
        System.out.println("The File is deleted: " + flag);
    }    
}
