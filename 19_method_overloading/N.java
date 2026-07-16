class Shape {
    int l;
    int h;
    int w;
    
    // Constructor Overloading is allowed
    Shape(int l) { 
        this.l = l;
    }   
    
    Shape(int l, int w) {
        this.l = l;
        this.w = w;
    }

    Shape(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
}
