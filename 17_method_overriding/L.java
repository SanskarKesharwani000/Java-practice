class L1 {
    Animal pro() {
        return null;
    }
}

class L extends L1 {
    // Illegal Method Overriding... Return Type Mismatched
    LivingBeing pro() {
        return null;
    }
}
