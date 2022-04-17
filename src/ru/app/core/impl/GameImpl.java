package ru.app.core.impl;

import ru.app.core.Game;
import ru.app.core.Player;

public class GameImpl implements Game {
    private static int MAXIMUM_GAME_POINT = 11;
    public int firstPlayerScore = 0;
    public int secondPlayerScore = 0;
    boolean isGameOver = false;

    @Override
    public void run(PingPongTableImpl pingPongTable, Player playerOne, Player playerTwo) {
        System.out.println("PING-PONG GAME");

        while (!isGameOver) {
            playerOneMove(playerOne,pingPongTable);
            if(!isGameOver)
            playerTwoMove(playerTwo,pingPongTable);
        }
        getWinner();

    }

    private void checkIfGameOver() {
        if(firstPlayerScore==MAXIMUM_GAME_POINT) isGameOver=true;
        if(secondPlayerScore==MAXIMUM_GAME_POINT) isGameOver=true;
    }

    private void getWinner() {
        if (firstPlayerScore > secondPlayerScore) {
            System.out.println("\nplayerOne is the Winner");
        } else System.out.println("\nplayerTwo is the Winner");
    }

    private void playerTwoMove(Player playerTwo, PingPongTableImpl pingPongTable) {
        System.out.println("\nplayerTwo's turn");
        TablePoint secondPlayerTableHitPoint = playerTwo.hit();
        if (pingPongTable.getPlayerOneTablePoints().contains(secondPlayerTableHitPoint)) {
            System.out.println("playerTwo hits opponent's table-> game continues");
        } else {
            System.out.println("playerTwo missed the table, playerOne gets plus point");
            firstPlayerScore++;
            getPlayersScore();
            checkIfGameOver();
        }

    }

    private void getPlayersScore() {
        System.out.println("\nCurrent Score Is:"+"\n" + "playerOne Score: " + firstPlayerScore + "\n" + "playerTwo Score " + secondPlayerScore);
    }

    private void playerOneMove(Player playerOne, PingPongTableImpl pingPongTable) {
        System.out.println("\nplayerOne's turn");
        TablePoint firstPlayerTableHitPoint = playerOne.hit();
        if (pingPongTable.getPlayerTwoTablePoints().contains(firstPlayerTableHitPoint)) {
            System.out.println("playerOne hits opponent's table-> game continues");
        } else {
            System.out.println("playerOne missed the table, playerTwo gets plus point");
            secondPlayerScore++;
            getPlayersScore();
            checkIfGameOver();
        }

    }
}
