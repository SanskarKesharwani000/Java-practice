import java.util.ArrayList;

class ScooterRental {
    ArrayList<Scooter> list = new ArrayList<>();
    
    void addScooter(Scooter s) {
        list.add(s);
    }

    Scooter rentScooter() {
        return list.remove(0);
    }
}
