package com.minidu.common.Drawer;

public class Circle extends Shape{



    private double radius;
    private String color;

    public Circle(double radius,int row, int col,  String color) {
        super(row, col);

        this.row = row;
        this.col = col;
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
