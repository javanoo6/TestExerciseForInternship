package ru.app.core;


import java.util.ArrayList;
import java.util.List;

public class PingPongTableLayoutBuilder {
    private List<TablePoint> buildPlayerTablePoints(TablePoint startPoint, int size) {
        List<TablePoint> list = new ArrayList<>();
        for(int i = startPoint.x; i <= startPoint.x + 5; i++) {
            for (int j = startPoint.y; j <= startPoint.y + 5; j++) {
                list.add(new TablePoint(i, j));
            }
        }
        return list;
    }

    private List<TablePoint> buildFaultTablePoints(TablePoint startPoint, int size, List<TablePoint> tablePoints) {
        List<TablePoint> faultTablePoints = buildPlayerTablePoints(startPoint, size);
        faultTablePoints.removeAll(tablePoints);
        return faultTablePoints;
    }
}
