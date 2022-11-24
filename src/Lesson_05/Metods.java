package Lesson_05;

import java.nio.channels.Pipe;

public class Metods {
    public static void main(String[] args) {

        /**
         Методы-
         Название класса (файла) должно четко отвечать на вопрос какие в нем собраны методы.
         Методы лучше разбивать по смыслам на разные классы (файлы),
         не должны быть все методы собраны в одном классе;
         Формула создания метода-
         1- модификатор доступа - это одно из 4-х видов слов,
         указывается перед методом или классом:
         1/public - метод/класс будет доступен внутри всех пакетов всего проекта (99% случоев используется);
         2/protected - внутри пакета и его наследникам, то есть дочерним классам, расположенных в других пакетах в данном проекте;
         _______- будет доступен только внутри текущего пакета (текущей папки);
         3/private - только внутри текущего класса (файла);
         -Статичность - два варианта: может быть указан признак статичности, либо нет:
         - не static, если метод будет вызываться у переменной text.split(" ");, то он не должен быть static; static - если метод будет вызываться у тuпа String.copyValue0f(char[] data);
         -Возвращаемый тип или слово void если метод ни чего не возвращает:
         public static int - если метод будет возвращать число; public static char[] - если возвращает массив символов;
         public static String - если возвращает строку;
         public static ****** - прочие варианты возвращаемых типов; public static void - если ни чего не возвращает, а просто выполняется, например, печать на консоль;
         4 - Название метода: поясняющее его суть, с моленькай буквы;
         5 - Входящие параметры в круглых скобках один или много через запятую с указанием типа
         6 - тело метода (то что должно происходить, когда метод вызовут);
         public static void printMassiveToConsole(int[][] mass)
         Модификаторы доступа метода Сигнатура метода
         * */





        Contact vasya = new Contact("Вася","987354407222","email.ru");
        Contact vital = new Contact("Виталя","9877707222","emffail.ru");
        Contact anya = new Contact("Аня","987401551222","emaihyhl.ru");
        Contact kata = new Contact("Катя","9874075222","emaigfgfl.ru");


        PhoneBook phoneBook = new PhoneBook();
//        phoneBook.addContact(vasya);
//        phoneBook.addContact(vital);
//        phoneBook.addContact(anya);
//        phoneBook.addContact(kata);
//
//        phoneBook.renameContact("kata","Ekaterina"); // переименование контакта

        System.out.println();

    }


}
