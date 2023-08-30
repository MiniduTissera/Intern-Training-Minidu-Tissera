package com.minidu.common.Drawer;

public class Shape {

    protected int row;
    protected int col;


    protected ShapeType type;

    public Shape(int row, int col, ShapeType type) {
        this.row = row;
        this.col = col;
        this.type = type;
    }


    public Shape() {

    }

    public ShapeType getType() {
        return type;
    }


}
