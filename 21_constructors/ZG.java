class ZG1 {
    ZG1(ZG q) {

    }
}

class ZG extends ZG1 {
    ZG() {
        super(this);
        System.out.println(this);     
    }
}


// ZG.java:9: error: cannot reference this before supertype constructor has been called
//         super(this);
//               ^
// 1 error