package ru.app.core;

import java.util.List;

public abstract class AbstractPingPongTable {
    abstract List<TablePoint> getPlayerOneTablePoints();
    abstract List<TablePoint> getPlayerTwoTablePoints();
    abstract List<TablePoint> getAllTablePoints();
}
