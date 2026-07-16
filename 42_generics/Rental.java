import java.util.ArrayList;

class Rental<E> {
    ArrayList<E> list = new ArrayList<>();

    void add(E a) {
        list.add(a);
    }

    E rent() {
        return list.remove(0);
    }
}
