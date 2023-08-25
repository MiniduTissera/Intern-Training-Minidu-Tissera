package com.minidu.smileface;

import com.minidu.common.Drawer.Drawer;
import com.minidu.common.Theme;

public class Application {

    public static void main(String[] args){

        //add theme number (1,2,3)
        FaceBuilder faceBuilder = new FaceBuilder();

        Face face = faceBuilder.buildFace();
        Drawer drawer = new Drawer();



        drawer.draw(face.getCircle());
        drawer.draw(face.getCurvedLines());

        drawer.displayframe();






    }

}
