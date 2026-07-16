class Shape1 {
    int length;
    int width;
    int height;
    
    Shape1(int length) {
        this.length = length;
    }

    Shape1(int length, int width) {
        this.length = length;
        this.width = width;
    }

    Shape1(int length, int width, int height) {
        this(length, width);
        // this.length = length;
        // this.width = width;
        this.height = height;
    }
}
