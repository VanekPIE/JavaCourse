package Lesson_04;

import java.util.Scanner;

public class Dop_Lesson {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        int d = 0;
//        int e = 0;
//        int f = 0;
//        int g = 0;
//
//        int [] array = new int[7];
//
//        array[0]= 11;
        
        
        
        //1. Создать массив на 20 чисел.
//2. Ввести в него значения с клавиатуры.
//3. Создать два массива на 10 чисел каждый.
//4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
//
//        int[] array = new int[20];
//        int [] array1 = new int [10];
//        int [] array2 = new int [10];


        Scanner scanner = new Scanner(System.in);
//        int a = array.length;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < array.length / 2; i++) {
//            array1[i] =array[i];
//            array2[i] = array[10 + i];
//        }
//        for (int i = 0; i < array2.length; i++) {
//            System.out.println(array2[i]);
//        }
//
//

        //Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
        // завтра на уроке разберем

        int [] array11 = new int[5];
        // сканер

        for (int i = 0; i < array11.length; i++) { //32. 14.5.85.114 пример
            array11[i] = scanner.nextInt();}

        for (int i = 0; i < array11.length; i++) {
            for (int j = 0; j < array11.length; j++) {
                if (array11[i] < array11[j]){
                    int x = array11[i];
                    array11[i] = array11[j];
                    array11[j] = x;
                }

            }

        }
        for (int i = 0; i < array11.length; i++) {
            System.out.println();

        }
        System.out.println();










        }
        
        
        
        
        
        

        

        
        
    }

