package SoloLearn.BasicConcepts;

import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        //your code goes here
        int hour = days*24;
        int minute = hour*60;
        int second = minute*60;

        System.out.println(second);
    }
}
