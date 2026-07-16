// By marking an instance variable final we have to initialize it at the same time we create it.

class N {
    final int x;
    final int y = 9;    
}


// N.java:2: error: variable x not initialized in the default constructor
//     final int x;
//               ^
// 1 error