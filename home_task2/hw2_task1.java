// Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.Scanner;

public class hw2_task1 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int num = scanner.nextInt();
        System.out.println("Введите последовательность из " + num + " чисел.");
        for (int i = 0; i < num; i++) {
            int x = scanner.nextInt();

            PrimeNumber prime = new PrimeNumber(x);
            Boolean check = prime.checkNum();
            if (check == true) {
                sum += x;
            }
        }
        System.out.println("Сумма простых чисел = " + sum);
    }
}

class PrimeNumber {
    private int number;
    private boolean check = true;

    public PrimeNumber(int num) {
        number = num;
    }

    public boolean checkNum() {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}