package SoloLearn.MoreOnClasses;

public class AnonymousClasses2 {
    public void print(){
        System.out.println("A");
    }
}
class C{
    public static void main(String[] args) {
        AnonymousClasses2 object = new AnonymousClasses2(){
            @Override public void print(){
                System.out.println("Hello");
            }
        };
        object.print();
    }
}