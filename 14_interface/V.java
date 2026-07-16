// a class cannot extend more than one class.

class Human {

}

class Plant {

}

class Machine {

}

class Animal {

}

class American extends Animal, Plant, Human, Machine {
    
}

// V.java:17: error: '{' expected
// class American extends Animal, Plant, Human, Machine {
//                              ^
// 1 error