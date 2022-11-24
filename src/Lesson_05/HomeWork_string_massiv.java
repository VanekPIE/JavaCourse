package Lesson_05;

import java.util.Scanner;

public class HomeWork_string_massiv {
//    5
//
//            1. Считать 6 строк и заполнить ими массив strings.
//            2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] strings = new String[6];
//
//        for (int i = 0; i < strings.length; i++)
//            strings[i] = scanner.nextLine();
//
//        for (int j = 0; j < strings.length; j++) {
//            int equ = 0;
//
//            for (int t = j + 1; t < strings.length; t++) {
//                if (strings[j] != null && strings[j].equals(strings[t])) {
//                    strings[t] = null;
//                    equ++;
//                }
//            }
//
//            if (equ > 0) {
//                strings [j] = null;
//                equ = 0;
//            }
//        }
//
//        for (int i = 0; i < strings.length; i++) {
//            System.out.print(strings[i]);
//        }
//
//


// 2
//Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите n количество строк");
//        String line = in.nextLine();
//        String minLine = line;
//        String maxLine = line;
//        while (!line.isEmpty()) {
//            if (minLine.length() > line.length()) {
//                minLine = line;
//            } else if (maxLine.length() < line.length()) {
//                maxLine = line;
//            }
//        }
//
//            System.out.println("Самая короткая строка " + minLine);
//            System.out.println("Самая длинная строка строка " + maxLine);

            //3
//        1. Создать массив на 10 строк.
//        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
//        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
//        Scanner scanner = new Scanner(System.in);
//        String[] list = new String[10];
//
//        for (int i=0; i<8; i++)
//        {
//            list[i] = scanner.nextLine();
//        }
//
//        for(int i = list.length-1; i >= 0; i--)
//        {
//            System.out.println(list[i]);
//        }

//        4
//
//        1. Создать массив на 10 строк.
//        2. Создать массив на 10 чисел.
//        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//        4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
//        которой совпадает с текущим индексом из массива чисел.
        Scanner scanner = new Scanner(System.in);

        String [] word = new String [5];
        int [] numbers = new int [5];
        for(int a = 0; a<word.length; a++)
        {
            word[a] = scanner.nextLine();
        }
        for (int b = 0; b<numbers.length; b++)
        {
            numbers[b] = word[b].length();
        }

        for(int c = 0; c < numbers.length; c++)
        {
            System.out.println(numbers[c]);
        }















    }
}
