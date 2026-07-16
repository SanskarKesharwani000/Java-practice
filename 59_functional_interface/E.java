@FunctionalInterface
interface E1 {
    void info();
}

@FunctionalInterface
interface E extends E1 {
    void info();
}
