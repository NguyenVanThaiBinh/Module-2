package com.BinhHu.PolyLine;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> point;

    public PolyLine() {
        point = new ArrayList<Point>();
    }

    public PolyLine(List<Point> points) {
        this.point = points;
    }

    public void appendPoint(Point point) {
        this.point.add(point);
    }

    public void appendPoint(int x, int y) {
        point.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < point.size() - 1; i++) {
            int x1 = point.get(i).getX();
            int y1 = point.get(i).getY();
            int x2 = point.get(i + 1).getX();
            int y2 = point.get(i + 1).getY();
            double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            length += distance;
        }
        return length;
    }
}
