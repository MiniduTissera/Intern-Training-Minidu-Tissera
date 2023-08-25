package com.minidu.common.Drawer;

public class Leaf extends Shape {

    private double radius;


    private String color;

    public Leaf(double radius, int row, int col, String color) {
        super(row, col, ShapeType.LEAF);
        this.radius = radius;
        this.row = row;
        this.col = col;
        this.color = color;

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
