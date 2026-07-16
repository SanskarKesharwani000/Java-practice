// A final class behaves normal as another class but only it is not inheritable

final class I1 {

}

class I {
    I1 pro(I1 x) {
        return new I1();
    }
}
