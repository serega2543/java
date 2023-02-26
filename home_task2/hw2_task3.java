// Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

import java.util.Arrays;
import java.util.Scanner;

public class hw2_task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int num = scanner.nextInt();
        System.out.println("Введите последовательность из " + num + " чисел.");
        int x;
        int[] arr = new int[num];
        int sum = 0;
        for (int i = 0; i < num; i++) {
            x = scanner.nextInt();
            if ((x > 9 && x < 100) | (x < -9 && x > -100)) {
                sum += i;
            }
            arr[i] = x;
        }
        scanner.close();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = sum;
            }
        }
    }

}