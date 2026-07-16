class DDD {
    static class RRR {

    }

    public static void main(String[] args) {
        RRR z = new RRR();    
    }
}


class Y {
    public static void main(String[] args) {
        // DDD.RRR w = new RRR();
        DDD.RRR w = new DDD.RRR();
    }
}
