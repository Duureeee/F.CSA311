package lab2.scr;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("heden huuhdiin undur oruulah ve? ");
        int n = scanner.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "-r huuhdiin undriig oruulna uu (cm): ");
            double height = scanner.nextDouble();
            sum += height;
        }

        double average = sum / n;
        System.out.printf("huuhduudiin dundaj undur: %.2f cm%n", average);

        scanner.close();
    }
}
