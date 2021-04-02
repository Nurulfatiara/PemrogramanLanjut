package SoloLearn.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int [ ] myArray = {6,42,3,7};
        double sum = 0.0;
        for (int x = 0; x < 4; x++){
            sum += myArray[x];
        }
        System.out.println(sum);
    }
}

