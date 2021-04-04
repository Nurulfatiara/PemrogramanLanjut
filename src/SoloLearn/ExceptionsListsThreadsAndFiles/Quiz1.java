package SoloLearn.ExceptionsListsThreadsAndFiles;

public class Quiz1 {
    void myFunc(int a, int b){
        try{
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
