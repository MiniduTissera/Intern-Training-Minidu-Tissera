package com.minidu.common.Drawer;

public class CurvedLine extends Shape {


    private final int width;
    private final int height;
    private final int radius;

    private final String color;

    public CurvedLine(int row, int col, int width, int height, int radius, String color) {
        super(row, col, ShapeType.CURVED_LINE);
        this.row = row;
        this.col = col;
        this.width = width;
        this.height = height;
        this.radius = radius;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
