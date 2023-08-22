package com.minidu.common.Drawer;

public class Line extends Shape {


    private int length;
    private int angle;
    private int thickness;

    private String color;


    public Line(int row, int col, int angle, int thickness, int length, String color) {
        super(row, col);
        this.row = row;
        this.col = col;
        this.length = length;
        this.angle = angle;
        this.thickness = thickness;
        this.color = color;

    }

    public int getLength() {
        return length;
    }

    public int getAngle() {
        return angle;
    }

    public int getThickness() {
        return thickness;
    }
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public String getColor() {
        return color;
    }
}


