package Lesson_09;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestSpeed {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10); // пронумерованный список

        long start = System.currentTimeMillis(); // засечка времени

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);

        }

        long end = System.currentTimeMillis(); // конец отсчета времени END

        System.out.println(" Добавление в ArrayList заняло" + (end - start));





        LinkedList<Integer> linkedList = new LinkedList<>(); // живая очередь коллекции

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        System.out.println(" Добавление в LinkedList заняло" + (end - start));

    //    int a = 10;

//        while (a > 0){
//            System.out.println("Обратный отчет  " + a);
//            try {
//                Thread.sleep(1000); //
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            a--;
//        }


        System.out.println();

}}
