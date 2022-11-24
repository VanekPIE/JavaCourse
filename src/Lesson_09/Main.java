package Lesson_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[7];  //  статический массив
       array[0] = 11;
        int a = 0;
        Integer b = 10; // ссылочный тип

        // 1. Задача - Создание коллекции и добавление в нее элементов

        ArrayList<Integer> list = new ArrayList<>();  // динамический массив  ( автоматом 10 индексов )
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(55);
        list.add(66);
        list.add(77);

        // 2. Метод add() -  добавляет значение с указанием индека
        list.add(2,88);  // при заполении следующий сдвигается вправо

        // 3. Метод set()- заменить значение по определенному индексу

        list.set(3,99);

        // 4. метод size() -  возвращает размер коллекции
       // System.out.println(list.size());

        // 5. get() -  брать объекты нашей коллекции
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + ",");}

        for (Integer c : list) {  // достает по порядку без указания индекса
            System.out.print(c + " , ");}

        // 6. toArray() - преобразование коллекции в массив

        Object [] objects = list.toArray();

        for (Object o: objects) {
            System.out.println(o + " , ");
        }

        //  7 . метод contains() - содержит ли наша коллеция определенный элемент
        System.out.println("В коллекции содержится 101 - "+  list.contains(101));
        System.out.println("В коллекции содержится 88 - " + list.contains(88));


        // 8. addAll() - добавить все элементы в новую коллекцию из старой

        ArrayList<Integer> copyList = new ArrayList<>();
        copyList.addAll(list);

        // 9 . - remove() - удаление элементов коллекции по определенному индексу

        System.out.println(" до вызова метода remove() по индексу 0"+ list);
        list.remove(0);
        System.out.println(" до вызова метода remove() по индексу 0"+ list);

        // 10.  - метод indexOf(), возвращает индекс определенного элемента в массиве - в каком индексе лежит этот элемент
        System.out.println("Индеск элемента 88 - " + list.indexOf(88));

        // 11. sort() - сортировка
//
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(11);
//        list1.add(22);
//        list1.add(66);
//        list1.add(78);
//        list1.add(96);

        // 12. метод isEmpty() - проверка пустой лист или нет - да или нет
        System.out.println(list.isEmpty());

        // 13. clear() - удаление всех элементов коллекции

        list.clear(); // напечатает пустую коллекцию








        System.out.println(list);

        System.out.println();





    }
}
