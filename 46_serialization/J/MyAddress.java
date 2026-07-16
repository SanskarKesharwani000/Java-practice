import java.io.Serializable;

class MyAddress extends Address implements Serializable {
    MyAddress(String city, String state, int pinCode) {
        super(city, state, pinCode);
    }
}
