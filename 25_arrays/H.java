class H {
    public static void main(String[] args) {
        Employee[] emps = {
            new Employee("Gopal", 32, new Address("House No. 234", new City("Jabalpur"), new State("MP"))),
            new Employee("Sarvesh", 38, new Address("Plot No. A/32", new City("Jaipur"), new State("RJ"))),
            new Employee("Binson", 27, new Address("Lemon Street", new City("Pune"), new State("MH")))
        };

        for(Employee next : emps)
            // System.out.println(next);
            System.out.println(next.name + " " + next.age);
    }    
}
