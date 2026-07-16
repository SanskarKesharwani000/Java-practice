interface AA {

}

class ZZ implements AA {

}

class XYZ {
    public static void main(String[] args) {
        AA x = new ZZ();
        
        if(x instanceof Object)
            System.out.println("Hello");
    }   
}
