package Lesson_07;

public class Person_01 implements PeopleInterface {
    @Override
    public void run() {
        System.out.println("Трусцой");

    }

    @Override
    public void jump() {
        System.out.println("Высоко");

    }

    @Override
    public void love() {
        System.out.println("Сильно");

    }

    @Override
    public void cry() {
        System.out.println("Взахлеб");

    }

    @Override
    public void laugh() {
        System.out.println("Больно");

    }
}
