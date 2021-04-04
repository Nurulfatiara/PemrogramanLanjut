package SoloLearn.ExceptionsListsThreadsAndFiles;

public class Quiz3 {
    class B implements Runnable{
        public void run() {
            System.out.println("b");
        }
    }
    class A extends Thread {
        public void run() {
            System.out.println("A");
            Thread t = new Thread(new B());
            t.start();
        }

        public void main(String[] args) {
            A object = new A();
            object.start();
        }
    }
}
