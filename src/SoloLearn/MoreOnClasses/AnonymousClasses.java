package SoloLearn.MoreOnClasses;

public class AnonymousClasses {
    public static void main(String[] args) {
        Machine m = new Machine() {
            @Override public void start(){
                System.out.println("Hi");
            }
        };
        m.start();
    }
}
class Machine {
    public void start() {
        System.out.println("Hi");
    }
}