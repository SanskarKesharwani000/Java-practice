// This example shows that to built connection we have to first load Driver class and for this we have to pass full path of Driver class and it will be loaded.

class A{
    static public void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}