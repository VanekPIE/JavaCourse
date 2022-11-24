package Lesson_08;

import Lesson_08.interfaces.Player;
import Lesson_08.models.CroupierBJ;
import Lesson_08.models.GameBJImpl;
import Lesson_08.models.PlayerImpl;

public class main {
    public static void main(String[] args) {

   // 1. Создать класс игру , в которой у нас происходит игра
//        2. Создаем игроков
//        3. Создаем крупье
//                4. Добавить игроков и крупье в игру
//                5. Добавить колоду карт
//                6. Добавим карты в колоду
//                7.Раздать каждому игроку по 2 карты на старте
//                8. Раздавать каждому игроку по одной карте пока это тредуется
//                9. Определить победителя


        // создали игру
        GameBJImpl gameBJ = new GameBJImpl();


        // Создали игроков

        PlayerImpl player = new PlayerImpl();
        PlayerImpl player2 = new PlayerImpl();

        // Создали крупье

        CroupierBJ croupierBJ = new CroupierBJ();

        // добавляем игроков и крупье в игру

         gameBJ.addPlayerInGame(player);
         gameBJ.addPlayerInGame(player2);
         gameBJ.addPlayerInGame(croupierBJ);
        //5. Добавить колоду карт
        //6. Добавим карты в колоду
        // 7.Раздать каждому игроку по 2 карты на старте

        gameBJ.giveTwoCardsOnHand();

        // 8. Раздавать каждому игроку по одной карте пока это требуется
        gameBJ.giveOneCardIfNeedToPlayer();

        //9. Определить победителя

        gameBJ.printWinner();





    }
}
