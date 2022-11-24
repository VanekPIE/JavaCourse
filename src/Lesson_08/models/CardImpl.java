package Lesson_08.models;

import Lesson_08.interfaces.Card;

public class CardImpl implements Card {

    private String NameCard;

    private int value;

    public CardImpl(String nameCard, int value) {
        NameCard = nameCard;
        this.value = value;
    }

    @Override
    public void printCard() {
        System.out.println(NameCard);

    }

    @Override
    public int getValue() {
        return value;
    }
}
