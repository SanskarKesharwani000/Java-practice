class Address {
    String addr;
    City city;
    State state;

    public Address(String addr, City city, State state) {
        this.addr = addr;
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return addr + " - " + city + " - " + state;
    }
}
