class Q {
    public static void main(String[] args) {
        Class<QQ> k = QQ.class;

        Class[] arr = k.getDeclaredClasses();
        
        for(Class next : arr)
            System.out.println(next);
    }
}

class QQ {
    class A {

    }

    static class B {

    }

    private class C {

    }

    enum D {

    }

    interface E {

    }
}
