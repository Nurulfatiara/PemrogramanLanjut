package SoloLearn.MoreOnClasses;

public class TypeCasting2 {
    public void print() {
        System.out.println("A");
    }
}
class B extends TypeCasting2 {
    public void print() {
        System.out.println("B");
    }
    public static void main(String[] args) {
     TypeCasting2 object = new B() ;
     B b = (B) object;
     b.print();
    }
}