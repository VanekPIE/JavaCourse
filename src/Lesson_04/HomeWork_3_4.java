package Lesson_04;

import java.util.Scanner;

public class HomeWork_3_4 {
    public static void main(String[] args) {

//        Вводить с клавиатуры числа.
//        Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
//                -1 должно учитываться в сумме.
//
//        Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
//
//        while (true) {
//            int number = считываем число;
//            if (проверяем, что number -1)
//            break;
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:   ");

        int summa = 0;

        while (true){

            int a = scanner.nextInt();
            if ( a != -1) {
                summa = summa + a;}
            else  if (a == -1){
                System.out.println(summa + -1);
            }
            break;

        }

    }

}

