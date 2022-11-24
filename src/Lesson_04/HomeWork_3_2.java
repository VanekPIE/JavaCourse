package Lesson_04;

public class HomeWork_3_2 {
    public static void main(String[] args) {
/*
        Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

        Пример вывода на экран:
        8
        88
        888
        8888
        88888
        888888
        8888888
        88888888
    888888888


*/
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {    // цикл в цикле
                System.out.print("8");

            }
            System.out.println();

        }

    }
}
