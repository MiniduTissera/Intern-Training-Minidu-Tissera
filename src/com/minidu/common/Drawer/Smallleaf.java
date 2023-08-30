package com.minidu.common.Drawer;

public class Smallleaf extends Leaf{

    private final double radius;


    private final String color;

    public Smallleaf(double radius, int row, int col, String color, int depth) {
        super(radius, row, col, color, depth);
        this.radius = radius;
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
