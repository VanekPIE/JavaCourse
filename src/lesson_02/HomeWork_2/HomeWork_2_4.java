package lesson_02.HomeWork_2;

import java.util.Scanner;

public class HomeWork_2_4 {
    public static void main(String[] args) {
//        Написать программу, которая будет проверять число, которое мы подадим ей.
//                Если число положительное, то увеличить его в два раза.
//                Если число отрицательное, то прибавить единицу.
//        Если введенное число равно нулю, необходимо вывести ноль.
//        Вывести результат в консоль.

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
          if (x < 0){
              x = x + 1;
              System.out.println(x);
          } else if (x == 0) {
              System.out.println(x);
          } else if (x > 0) {
              x = x * 2;
            System.out.println(x);
        }
    }
}
