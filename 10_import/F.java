// In this example if two classes of same name are used in our file then we have to use another file with the import where it is used

import java.util.Date;
// import java.sql.Date;

class F {
    public static void main(String[] args) {        
        
    }
} 



// F.java:2: error: a type with the same simple name is already defined by the single-type-import of Date
// import java.sql.Date;
// ^
// 1 error