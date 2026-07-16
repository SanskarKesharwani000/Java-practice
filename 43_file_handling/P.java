import java.io.File;

class P {
    public static void main(String[] args) {
        File f1 = new File("E:/MOVIES/Shambhavi_Kriya.mp4");
        
        // File f2 = new File("D:/STS/Shambhavi_Kriya.mp4");
        File f2 = new File("Shambhavi_Kriya.mp4");
        

        f1.renameTo(f2);
        
    }
}
