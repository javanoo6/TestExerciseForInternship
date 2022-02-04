package ru.app.core;

import ru.app.core.impl.PingPongTableImpl;

public interface GameReferee {
    void judgeGame(PingPongTableImpl pingPongTable, Player playerOne, Player playerTwo);
}
