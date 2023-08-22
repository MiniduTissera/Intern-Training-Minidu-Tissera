package com.minidu.smileface;

import com.minidu.common.Drawer.Circle;
import com.minidu.common.Drawer.CurvedLine;

public class FaceBuilder {

    String color1 ;
    String color2 = "\u001B[40m \u001B[0m";

    private int theme;


    public FaceBuilder(int theme) {
       this.theme = theme;
    }



    public Circle buildBigCircle(double radius, int row, int col) {

        switch (theme) {
            case 1://yellow
                color1 = "\u001b[48;2;255;255;0m \u001b[0m";
                break;
            case 2://green
                color1 = "\u001B[42m \u001B[0m";
                break;
            case 3://blue
                color1 = "\u001B[44m \u001B[0m";
                break;
            default://yellow
                color1 = "\u001b[48;2;255;255;0m \u001b[0m";
                break;
        }


            Circle circle = new Circle(radius, row, col, color1);
            return circle;



    }

    public Circle buildSmallCircle(int row, int col) {



        Circle circle = new Circle(2, row, col,color2);
        return circle;
    }

    public CurvedLine buildCurvedLine(int row, int col) {
        CurvedLine curvedLine = new CurvedLine(row, col, 4,10,4,color2);
        return curvedLine;
    }


    public Face buildFace(){

        Face face = new Face();

        face.addCircle(buildBigCircle(8,15,20));
        face.addCircle(buildSmallCircle(12,24));
        face.addCircle(buildSmallCircle(12,16));

        face.addCurvedLine(buildCurvedLine(16,41));

        return face;


    }


}
