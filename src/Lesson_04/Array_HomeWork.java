package Lesson_04;

import java.util.Scanner;

public class Array_HomeWork {
    public static void main(String[] args) {
        //1.
//        1. Создать массив на 10 строк.
//        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
//        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
//         Каждый элемент - с новой строки.

        //    int [] array = new int[10];

        Scanner scanner = new Scanner(System.in);

//        int a = array.length;
//
//        for (int i = 0; i <= 8; i++) {
//            array[i] = scanner.nextInt();}
//
//        for (int i = 0; i < array.length; i++)
//
//            System.out.print(array[10] - i);

//        2
//
//        1.1. Создай массив на 10 чисел
//        1.2. Считай с консоли 10 чисел и заполни ими массив
//        2. Найти максимальное число из элементов массива

        int [] array = new int [10];
        int a = array.length;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }


        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];}
        }

        System.out.println(max);


    }
}
