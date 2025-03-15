package _04_Control_Flow;

import java.util.Scanner;

public class _04_LotterySystemForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total numbers available (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter numbers to be picked (k): ");
        int k = scanner.nextInt();

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }

        System.out.println("Your chances of winning are 1 in " + lotteryOdds);
        scanner.close();
    }
}
