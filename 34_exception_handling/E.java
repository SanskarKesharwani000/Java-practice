import java.io.IOException;

class E {
    public static void main(String[] args) {
        try {
            throw new IOException();        
        } catch(IOException e) {
            e.printStackTrace();            
        }
    }    
}
