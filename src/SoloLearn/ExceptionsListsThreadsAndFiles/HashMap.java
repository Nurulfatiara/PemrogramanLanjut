package SoloLearn.ExceptionsListsThreadsAndFiles;

import java.util.HashMap;

class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> m = new HashMap<String, String>();
        m.put("A", "First");
        m.put("B", "Second");
        m.put("C","Thrid");
        System.out.println(m.get("B"));
    }
}
