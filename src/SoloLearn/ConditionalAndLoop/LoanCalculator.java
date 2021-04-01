package SoloLearn.ConditionalAndLoop;
import java.util.Scanner;
public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int remain = amount;
        for (int i = 0; i < 3; i++){

            int payment = (int)Math.ceil(10/100.0*remain);
            remain -= payment;
        }
        System.out.println(remain);
    }

}
