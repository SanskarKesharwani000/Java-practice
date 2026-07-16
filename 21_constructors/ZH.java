class ZH {
    int a = 90;

    ZH() {
        this(this.a);
        System.out.println(this.a);
    }   
    
    ZH(int y) {

    }
}


// ZH.java:5: error: cannot reference this before supertype constructor has been called
//         this(this.a);
//              ^
// 1 error
