package Lesson_08.models;

public class CroupierBJ extends PlayerImpl {

    @Override
    public boolean needCard() {
        return countValuesOfAllCardsOnHand() <= 17;

    }

    @Override
    public boolean isCroupier() {
        return true;
    }
}
