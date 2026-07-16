import java.util.ArrayList;

class CarRental {
    ArrayList<Car> list = new ArrayList<>();
    
    void addCar(Car c) {
        list.add(c);
    }

    Car rentCar() {
        return list.remove(0);
    }
}
