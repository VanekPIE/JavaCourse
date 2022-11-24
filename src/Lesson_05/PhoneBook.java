package Lesson_05;

import java.util.Scanner;

public class PhoneBook {


    // 1. Поля
    private Contact[] contacts = new Contact[10];


    // 2. Конструкторы

//    // 3. Методы
//    public void addContact(Contact contact) { ///    Добавление контактов в массив ( в справочник)
//        for (int i = 0; i < contacts.length; i++) {
//            if (contacts[i] == null) {
//                contacts[i] = contact;
//                break;}
//        }
//    }
// public void renameContact(String original, String renamed){   // переименование контактов
//     for (int i = 0; i < contacts.length; i++) {
//         if (contacts[i] != null && contacts[i].getName().equalsIgnoreCase(original)) {
//             {
//                 contacts[i].setName(renamed);
//                 break;
//             }
//         }
//     }

     public void deleteContact(String name){  // удаление контакта
         for (int i = 0; i < contacts.length; i++) {
             if (contacts[i].getName().equalsIgnoreCase (name)){
                 contacts[i] = null;
                 break;
             }

         }

 }





}





