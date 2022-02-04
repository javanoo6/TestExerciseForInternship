package ru.app.core.impl;

import ru.app.core.GameReferee;
import ru.app.core.Player;

public class GameRefereeImpl implements GameReferee {
    private static int MAXIMUM_GAME_POINT = 11;

    @Override
    public void judgeGame(PingPongTableImpl pingPongTable, Player playerOne, Player playerTwo) {
        //TODO напиши здесь реализацию игры в пинг-понг двух игроков, используя их имплементации
        // алгоритм реализации:
        // При каждом ударе игрока судья проверяет, попал ли игрок по столу соперника или нет. И пишет в console лог об успешности удара (попал или не попал и по какой точке был совершен удар).
        // В случае, если игрок не попадает по столу, очко присуждается его сопернику (общий счет выводится в консоль).
        // Очко разыгрывается до тех пор, пока один из игроков не попадет по столу соперника.
        // Очки суммируются и тот, кто наберет первым 11 очков, будет победителем.
    }
}
