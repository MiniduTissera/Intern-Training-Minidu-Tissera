package com.minidu.common.Drawer;

public class Line extends Shape {


    private final int length;
    private final int angle;
    private final int thickness;

    private final String color;


    public Line(int row, int col, int angle, int thickness, int length, String color) {
        super(row, col, ShapeType.LINE);
        this.row = row;
        this.col = col;

        this.angle = angle;
        this.thickness = thickness;
        this.length = length;

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


