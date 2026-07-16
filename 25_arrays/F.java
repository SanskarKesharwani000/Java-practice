class F {
    public static void main(String[] args) {
        Employee[] emps = {
            new Employee("Gopal", 32, new Address("House No. 234", new City("Jabalpur"), new State("MP"))),
            new Employee("Sarvesh", 38, new Address("Plot No. A/32", new City("Jaipur"), new State("RJ"))),
            new Employee("Binson", 27, new Address("Lemon Street", new City("Pune"), new State("MH")))
        };

        // System.out.println(emps[2].address.city.cityName);
        // System.out.println(emps);
        System.out.println(emps[0]);
        // System.out.println(emps[0].address);
        // System.out.println(emps[0].address.city);
        // System.out.println(emps[0].address.city.cityName);
    }    
}
