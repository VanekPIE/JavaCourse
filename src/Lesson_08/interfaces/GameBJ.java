package Lesson_08.interfaces;

import Lesson_08.models.PlayerImpl;

public interface GameBJ {
    void addPlayerInGame(PlayerImpl player); // добавить игрока в игру

    void giveTwoCardsOnHand();  // раздача 2 карт на старте

    void giveOneCardIfNeedToPlayer(); // давать доп карту игроку если ему нужно

    void printWinner(); // объявлять победителя

}
