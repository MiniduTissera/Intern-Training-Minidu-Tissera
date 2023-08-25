package com.minidu.common.Drawer;

public class Circle extends Shape {



    private double radius;
    private String color;

    public Circle(int row, int col, double radius, String color) {
        super(row, col, ShapeType.CIRCLE);
        this.radius = radius;
        this.color = color;
        this.col=col;
        this.row = row;
    }



    public double getRadius() {
        return radius;
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
