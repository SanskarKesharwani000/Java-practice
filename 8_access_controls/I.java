// Access control cannot be marked to local level variable as they are not accessible outside their scope

class I {
    void pro() {
        public int y = 90;
    }    
}


// I.java:3: error: illegal start of expression
//         public int y = 90;
//         ^
// I.java:5: error: class, interface, enum, or record expected
// }
// ^
// 2 errors
