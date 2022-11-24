package Lesson_08.interfaces;

public interface Player {
    void takeCard(Card card);
    int countValuesOfAllCardsOnHand();
    boolean needCard();
    void showCardOnHand();

}
