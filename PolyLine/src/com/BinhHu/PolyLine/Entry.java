package com.BinhHu.PolyLine;

public class Entry {
    public static void main(String[] args) {
        PolyLine polyLine = new PolyLine(); //polyLine ở đây là một đối tượng của ArrayList

        polyLine.appendPoint(new Point(1, 1)); //

        polyLine.appendPoint(new Point(2, 3));

        polyLine.appendPoint(3, 0);
        polyLine.appendPoint(4, 2);
        System.out.println(polyLine.getLength());
    }
}