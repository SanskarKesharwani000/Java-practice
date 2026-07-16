// This example shows that we can create identifier of method, class , local variable,instance variable as of same name because they are different and compiler differentiate between them.

class N{
    void N(){

    }

    // N N = new N();
    static N N = new N();
    N(){
     
    }

    static public void main(String[] args){
        // N N = new N();
        System.out.println(N);   
    }
}