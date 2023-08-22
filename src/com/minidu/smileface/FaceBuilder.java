package com.minidu.smileface;

import com.minidu.common.Drawer.Circle;
import com.minidu.common.Drawer.CurvedLine;
import com.minidu.common.Theme;

public class FaceBuilder {



    Theme theme = new Theme();

    String themeColor1 = theme.theme1facecolor();
    String themeColor2 = theme.theme1eyecolor();





    public Circle buildBigCircle(double radius, int row, int col) {




            Circle circle = new Circle(radius, row, col, themeColor1);
            return circle;



    }

    public Circle buildSmallCircle(int row, int col) {



        Circle circle = new Circle(2, row, col,themeColor2);
        return circle;
    }

    public CurvedLine buildCurvedLine(int row, int col) {
        CurvedLine curvedLine = new CurvedLine(row, col, 4,10,4,themeColor2);
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
