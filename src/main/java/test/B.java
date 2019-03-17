package test;
class  A {

    void doIt (){
        System.out.println("A");
    }
}
public class B  extends  A{
    void doIt () {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A b  = new B();
       // b.go();
    }
    void go() {
        doIt();
    }
}
