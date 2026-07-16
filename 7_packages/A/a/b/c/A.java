// for package level access first we have to define the package in that class and package declaration is always the first line of the java file.

package a.b.c;

class A {
    public static void main(String[] args) {
        B x;
    }
}



// a\b\c\A.java:5: error: cannot find symbol
//         B x;
//         ^
//   symbol:   class B
//   location: class A
// 1 error
