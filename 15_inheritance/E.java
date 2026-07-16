interface E2 {
    void bbb();
}

class E1 {
    void aaa() {
        System.out.println("Rahul");
    }
}

class E extends E1 implements E2 {
        
}



// E.java:11: error: E is not abstract and does not override abstract method bbb() in E2
// class E extends E1 implements E2 {
// ^
// 1 error