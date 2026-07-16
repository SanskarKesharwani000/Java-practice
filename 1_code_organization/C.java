// A class cannot be run if it do not have main method inside it but if it is used in another class then it will be compiled directly.

class C {

}



// >javac C.java
// >java C

// Error: Main method not found in class C, please define the main method as:
//    public static void main(String[] args)
// or a JavaFX application class must extend javafx.application.Application
