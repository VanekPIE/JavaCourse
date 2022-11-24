package Lesson_08.models;

import Lesson_08.interfaces.Card;
import Lesson_08.interfaces.Player;

import java.util.Scanner;

public class PlayerImpl implements Player {


    // fields

    String name;

    Card [] cardsOnHand = new Card [100];

    boolean inGame;

    boolean isCroupier = false;



    // constructor


    // methods




    @Override
    public void takeCard(Card card) {
        for (int i = 0; i < cardsOnHand.length; i++) {
            if ( cardsOnHand[i] == null)
            {
                cardsOnHand[i] = card;
                break;
            }
        }

    }

    @Override
    public int countValuesOfAllCardsOnHand() {
        int count = 0;
        for (Card c :cardsOnHand) {
            count += c.getValue();
        }
        return 0;
    }

    @Override
    public boolean needCard() {
        System.out.println(" --------Ваши карты ----------");
        showCardOnHand();
        System.out.println("Нужна ли Вам еще карта?");
        Scanner scanner = new Scanner(System.in);  // Ведите карту с консоли если она требуется
        String answer = scanner.nextLine(); // переменная ответ
        if (answer.equals("Да")){
            return true;
        }
        return false;
    }

    @Override
    public void showCardOnHand() {


        for (Card card : cardsOnHand){
            if (card != null){
                card.printCard();
            }
        }
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public boolean isCroupier() {
        return isCroupier;
    }

    public void setCroupier(boolean croupier) {
        isCroupier = croupier;
    }
}
