class C {
    public static void main(String[] args) {
        Student[] x = {
                            new Student("om", 25), 
                            new Student("ram", 18), 
                            new Student("shyam", 23)
                      };
        
        System.out.println(x);
        System.out.println("------------");

        for(int i=0;i<x.length;i++) 
            System.out.println(x[i]);
    }    
}
