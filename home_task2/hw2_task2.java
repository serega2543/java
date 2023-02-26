// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

import java.util.Scanner;

public class hw2_task2 {

    public static void main(String[] args) {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int num = scanner.nextInt();
        System.out.println("Введите последовательность из " + num + " чисел.");
        int curr_n = 0;
        int x;
        for (int i = 0; i < num; i++) {
            x = scanner.nextInt();
            if (i != 0 && x <= curr_n && check == true) {
                check = false;
            }
            curr_n = x;
        }
        scanner.close();
        System.out.println(check);
    }

}