package Lesson_04;

import java.nio.charset.MalformedInputException;

public class Aplication {
    public static void main(String[] args) {
        // Массивы  - Arrays
        // используем Только данные отдного типа

       // int [] array = new int[10];
       // int [] array2 = new int[] {1,2,3,4,5};
     int [] array3 = new int[100];
//
//        array3[0]= 11;
//        array3[1]= 11;
//        array3[2]= 11;
//        array3[3]= 11;
//        array3[4]= 11;
//
//        System.out.println();

        for (int i = 0; i < 5; i++) {
            array3[i] = i +1;}

        //Задача 1.  печать каждой ячейки массива

        for (int i = 0; i < 5; i++) {
            System.out.println(array3[i]);}

        // Задача 2. Печать только четные элементы массива
        for (int i = 0; i < 100; i++) {
            if (array3[i] % 2 == 0) {
                System.out.println(array3[i]);
            }
        }


        // задача 3. Печатать массив нечетных индексов от 10 до 30

        for (int i = 10; i <= 30 ; i++) {
            if (array3[i] % 2 != 0);{
                System.out.print (array3[i] + "  ");
            }

        }




        System.out.println();




    }
}
