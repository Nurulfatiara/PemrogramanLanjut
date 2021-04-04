package SoloLearn.ExceptionsListsThreadsAndFiles;

public class Quiz2 {
    void myFunc(int arg)
        throws IllegalArgumentException
    {
        if (arg < 0)
            throw new IllegalArgumentException();
    }
}
