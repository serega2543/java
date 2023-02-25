import java.util.Scanner;

/*Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
Пример: 1 2 1 2 -1 1 3 1 3 -1 0
2 -1 переход - 2 в сумму
3 -1 переход 3 в сумму
суммарно выведет 5
*/
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        String str = "1 2 1 2 -1 1 3 1 3 -1 0";
        String[] mas = str.split(" ");

        int sum = 0;
        for (int i = 0; i < mas.length-1; i++) {
            int next_el = Integer.parseInt(mas[i+1]);
            if (next_el<0){
                int curr_element = Integer.parseInt(mas[i]);
                sum += curr_element;
            }
            // System.out.println("---"+sum);
        }
        System.out.println("Итоговая сумма: " + sum);       
    }    
}

