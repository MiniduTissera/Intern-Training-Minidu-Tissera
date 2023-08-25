package com.minidu.smileface;

import com.minidu.common.Drawer.Circle;
import com.minidu.common.Drawer.CurvedLine;
import com.minidu.common.Drawer.Leaf;
import com.minidu.common.Theme;

public class FaceBuilder {



    static Theme theme = new Theme();

    static String themeColor1 = theme.theme1facecolor();
    static String themeColor2 = theme.theme1eyecolor();





    public static Circle buildBigCircle( int row, int col,double radius) {




            Circle circle = new Circle(  row, col,radius, themeColor1);
            return circle;



    }

    public static Circle buildSmallCircle(int row, int col,int radius) {



        Circle circle = new Circle( row, col,radius,themeColor2);
        return circle;
    }

    public static CurvedLine buildCurvedLine(int row, int col,int radius) {
        //CurvedLine curvedLine = new CurvedLine(row, col, 4,10,4,themeColor2);
        CurvedLine curvedLine = new CurvedLine(row, col, 10,25,radius,themeColor2);
        return curvedLine;
    }


    public static Leaf buildLeaf(int col, int row, int depth){



        Leaf leaf1 = new Leaf(1.8,row,col,themeColor2);

        return leaf1;


    }



    public Face buildFace(){

        Face face = new Face();


        face.addCircle(buildBigCircle(15,20,8));
        face.addCircle(buildSmallCircle(12,24,2));
        face.addCircle(buildSmallCircle(12,16,2));

        face.addCurvedLine(buildCurvedLine(16,41,4));

        return face;


    }

    public static Face buildFace2D(){

        Face face = new Face();

        face.addLeaf(buildLeaf(160,120, 0));
        face.addLeaf(buildLeaf(260,120, 0));
        face.addCircle(buildBigCircle(230,200,140));


        face.addCurvedLine(buildCurvedLine(240,235,60));

        return face;


    }




}
