import java.io.Serializable;

class Shape1 implements Serializable {
    int length;    
    int width;    
    int height;
    
    Shape1(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Shape Object=> length:" + length + " - width: " + width + " - height: " + height;
    } 
}
