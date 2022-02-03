package ru.app.core;

public abstract class AbstractGameReferee {
    public static int MAXIMUM_GAME_POINT = 11;
    abstract void judgeGame(Player playerOne, Player playerTwo);
}
