package Lesson_03;

public class Application {
    public static void main(String[] args) {

        // Циклы
        // fori, while, foreach


        // fori
//
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//
//        for (int i = 0; i < 5; i++)
//            System.out.println("Hello");
//
// Задача 1. вывести в цикле все четные числа от 1 до 50

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }}
        // Задача 2. Вывести все цифры от 1 до 100 , котрые деляться на 3 и на 5 одновременно

        for (int i = 1; i <= 100 ; i++) {
            if ( i % 3 == 0 && i % 5 == 0);{
                System.out.print(i + " ");
            }}
        System.out.println();
        // Задача 3. Сложить все цифры от 10 до 20

        int count = 0;
        for (int i = 10; i <= 20; i++) {
            count += i;
            System.out.println(count);}

        // Задача 4.

        for (int i = 10; i <=40 ; i++) {
            if (i < 15 || i > 20){
                System.out.print(i + "  ");
            }

            // Задача 5 Вывести сумму всех четных чискл от 10 до 50
             int summa = 0;

            for (int j = 10; j <= 50; j++) {
                if ( i % 2 == 0){
                    summa = summa + i;}
            }
            System.out.println(summa);


            int counter  = 10;

            while (counter >= 0) {
                System.out.println("Обратный отчет. Осталось " + counter +"  секунд");
                counter--;}
        }
    }
}
