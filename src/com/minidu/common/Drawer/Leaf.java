package com.minidu.common.Drawer;

public class Leaf extends Shape {

    private final double radius;


    private final String color;
    protected final int depth;

    public Leaf(double radius, int row, int col, String color, int depth) {
        super(row, col, ShapeType.LEAF);
        this.radius = radius;
        this.depth = depth;
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

    public int getDepth() {
        return depth;
    }

    public String getColor() {
        return color;
    }


}
