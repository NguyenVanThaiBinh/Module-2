package com.BinhHu.PolyLine;

import java.util.ArrayList;
import java.util.List;

public class PolyLine{
    private List<Point> points;
    public PolyLine(){
        points = new ArrayList<Point>();
    }
    public PolyLine(List<Point> points) {
        this.points = points;
    }
    public void appendPoint(Point points){
        points.add(points);
    }
}