package SoloLearn.ExceptionsListsThreadsAndFiles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
