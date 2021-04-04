package SoloLearn.ExceptionsListsThreadsAndFiles;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class WritingToFiles {
    public static void main(String[] args) throws FileNotFoundException {
        Formatter f = new Formatter("a.txt");
        f.format("%s","Hi");
        f.format("%s","there");
        f.close();
    }
}
