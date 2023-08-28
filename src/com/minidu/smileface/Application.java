package com.minidu.smileface;

import com.minidu.common.Drawer.Drawer;

public class Application {

    public static void main(String[] args) {


        FaceBuilder faceBuilder = new FaceBuilder();

        Face face = faceBuilder.buildFace();
        Drawer drawer = new Drawer();


        drawer.draw(face.getCircle());
        drawer.draw(face.getCurvedLines());

        drawer.displayFrame();


    }

}
