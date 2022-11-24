package Lesson_07;

public class Person_02 implements PeopleInterface {
    @Override
    public void run() {
        System.out.println(" Быстро очень");
    }

    @Override
    public void jump() {
        System.out.println(" Низко");

    }

    @Override
    public void love() {
        System.out.println("Болезненно");
    }

    @Override
    public void cry() {
        System.out.println(" чуть-чуть");

    }

    @Override
    public void laugh() {
        System.out.println("От большого количества денег");

    }
}
