package com.minidu.smileface;

import com.minidu.common.Drawer.Circle;
import com.minidu.common.Drawer.CurvedLine;
import com.minidu.common.Drawer.Leaf;
import com.minidu.common.Theme;

public class FaceBuilder {


    static Theme theme = new Theme();

    static String themeColor1 = theme.theme1facecolor();
    static String themeColor2 = theme.theme1eyecolor();


    public static Circle buildBigCircle(int row, int col, double radius) {


        return new Circle(row, col, radius, themeColor1);


    }

    public static Circle buildSmallCircle(int row, int col, int radius) {


        return new Circle(row, col, radius, themeColor2);
    }

    public static CurvedLine buildCurvedLine(int row, int col, int radius) {

        return new CurvedLine(row, col, 10, 25, radius, themeColor2);
    }


    public static Leaf buildLeaf(int col, int row, int depth) {


        return new Leaf(1.8, row, col, themeColor2, depth);


    }

    public static Face buildFace2D() {

        Face face = new Face();

        face.addLeaf(buildLeaf(160, 120, 0));
        face.addLeaf(buildLeaf(260, 120, 0));
        face.addCircle(buildBigCircle(230, 200, 140));


        face.addCurvedLine(buildCurvedLine(240, 235, 60));

        return face;


    }

    public Face buildFace() {

        Face face = new Face();


        face.addCircle(buildBigCircle(15, 20, 8));
        face.addCircle(buildSmallCircle(12, 24, 2));
        face.addCircle(buildSmallCircle(12, 16, 2));

        face.addCurvedLine(buildCurvedLine(16, 41, 4));

        return face;


    }


}
