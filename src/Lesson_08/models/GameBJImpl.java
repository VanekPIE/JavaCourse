package Lesson_08.models;

import Lesson_08.interfaces.GameBJ;
import Lesson_08.interfaces.Player;

public class GameBJImpl implements GameBJ {

    PlayerImpl[] playersInGame = new PlayerImpl[3];

    DeckOfCardsImp deckOfCardsImp;

    @Override
    public void addPlayerInGame(PlayerImpl player) {

        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == null){
                playersInGame[i] = player;
                break;
            }

        }
    }


    @Override
    public void giveTwoCardsOnHand() {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] != null){
                playersInGame[i].takeCard(deckOfCardsImp.randomCards());
                playersInGame[i].takeCard(deckOfCardsImp.randomCards());

            }

        }

    }

    @Override
    public void giveOneCardIfNeedToPlayer() {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] != null){
                while (playersInGame[i].needCard()){
                    playersInGame[i].takeCard(deckOfCardsImp.randomCards());
                }
            }

        }

    }

    @Override
    public void printWinner() {
        // Проход по всему масииву игроков в игре
        // и выключение всех игноков у кого больше 21

        for (PlayerImpl player :  playersInGame) {
            if ( player != null){
                if(player.countValuesOfAllCardsOnHand() > 21){
                    player.setInGame(false);
                }
            }

        }

        // 2. Победил один игрок, оставшийся в игре

        if (countPlayersInGame()== 1){
            System.out.println("Победил игрок :      ");
            for (PlayerImpl player: playersInGame) {
                if (player != null && player.isInGame()){
                    player.showCardOnHand();
                }
            }
        }
        // 3. Победило несколько игроков , нужно выбрать одного с лучшим значением на руках
        
        int bestValue = 0;
        for (PlayerImpl player: playersInGame) {
            if (player != null && player.isInGame()){
                if (bestValue < player.countValuesOfAllCardsOnHand()){
                    bestValue = player.countValuesOfAllCardsOnHand();
                }

            }
        }
        for (PlayerImpl player: playersInGame) {
            if (player != null && player.isInGame() && !player.isCroupier ){
                System.out.println("Победил игрок:   ");
                player.showCardOnHand();
            }
        }
        
        
        
    }

    public int countPlayersInGame(){
        int countPlayers = 0;
        for (PlayerImpl player: playersInGame) {
            if (player != null && player.isInGame()){
                countPlayers++;
            }
        }
        return countPlayers;
    }




}
