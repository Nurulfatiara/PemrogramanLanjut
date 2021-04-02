package SoloLearn.ClassesAndObjects;

public class ReferenceTypes {
    public ReferenceTypes(String andi) {
    }

    public static void main(String[] args) {
        ReferenceTypes p = new ReferenceTypes ("Andi");
        p.setAge(25);
        change(p);
        System.out.println(p.getAge());
    }

    private boolean getAge() {
        return false;
    }

    private void setAge(int i) {
    }

    static void change(ReferenceTypes p){
        p.setAge(10);
    }
}
