package Lesson_04;

import java.util.Scanner;

public class HomeWork_3_3 {
    public static void main(String[] args) {
//        Ввести с клавиатуры три числа, вывести на экран среднее из них.
//        Т.е. не самое большое и не самое маленькое.
//        Если все числа равны, вывести любое из них.

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int y = (a + b + c) / 3;
        if (a == b || a == c || c == b)
        {System.out.println(a);}
        else if (a != b || b != c || c != a){
            System.out.println(y);}


    }
}
