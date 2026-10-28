package Q14;
class A {
    A() {
        System.out.println("Constructor A");
    }
}

class B extends A {
    B() {
        System.out.println("Constructor B");
    }
}

class C extends B {
    C() {
        System.out.println("Constructor C");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
    }
}