package SoloLearn.ClassesAndObjects;

public class ValueTypes {
    public static void main(String[] args) {
        int x = 4;
        square(x);
        System.out.println();
    }
    static void square(int x){
        x = x*x;
    }
}
