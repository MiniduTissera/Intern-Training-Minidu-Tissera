package com.minidu.common.Drawer;

public class Rectangle extends Shape {


    private final int width;
    private final int height;

    private final String color;


    public Rectangle(int width, int height, int row, int col, String color) {
        super(row, col, ShapeType.RECTANGLE);
        this.width = width;
        this.height = height;
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }

    public int getRow() {
        return row;
    }


    public int getCol() {
        return col;
    }


    public String getColor() {
        return color;
    }
}
