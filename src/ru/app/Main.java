package ru.app;

import ru.app.core.impl.GameRefereeImpl;
import ru.app.core.impl.PingPongTableImpl;
import ru.app.core.impl.PlayerImpl;

public class Main {

    public static void main(String[] args) {
        var pingPongTable = new PingPongTableImpl();
        var gameReferee = new GameRefereeImpl();

        var playerOne = new PlayerImpl(
                pingPongTable.getPlayerOneTablePoints(),
                pingPongTable.getPlayerOneTablePointsForShouting()
        );
        var playerTwo = new PlayerImpl(
                pingPongTable.getPlayerTwoTablePoints(),
                pingPongTable.getPlayerTwoTablePointsForShouting()
        );

        gameReferee.judgeGame(pingPongTable, playerOne, playerTwo);
    }
}
