class E {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        System.out.println(x.getPriority());

        x.setPriority(100);  // acceptable range: 1-10

        System.out.println(x.getPriority());
    }    
}


// Exception in thread "main" java.lang.IllegalArgumentException
//         at java.base/java.lang.Thread.setPriority(Thread.java:1149)
//         at E.main(E.java:7)