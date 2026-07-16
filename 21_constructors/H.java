class H {    
    H() {
        System.out.println(this + " ------- ~~");
    }

    public static void main(String[] args) {
        H q = new H();

        System.out.println(q + " ------- ##");
    }
}


// H@3b07d329 ------- ~~
// H@3b07d329 ------- ##