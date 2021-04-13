package com.BinhHu.PolyLine;

import java.util.*;

public class PolyLine {
    private List<Point> points ; //tạo đối tượng tên points có kiểu dữ liệu là Points kế thừa từ List

    public PolyLine() {

        points = new ArrayList<>(); //tạo đối tượng points trong lớp ArrayList
    }

    public PolyLine(List<Point> points) {

        this.points = points;
    }

    public void appendPoint(Point point) { //thêm đối tượng mới vào ArrayList
        points.add(point);
    }

    public void appendPoint(int x, int y) {
        Point point1 = new Point(x, y);
        points.add(point1); //thêm đối tượng mới vào ArrayList thông qua đối tượng Point có sẵn
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            int x1 = points.get(i).getX();  //points.get(i) giá trị đầu tiên của ArrayList, tức là một đối tượng.
            int y1 = points.get(i).getY();
            int x2 = points.get(i + 1).getX(); // đối tượng tiếp theo trong ArrayList
            int y2 = points.get(i + 1).getY();
            double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)); //tính khoảng cách của 2 đối tượng
            length += distance;
        }
        return length;
    }
}