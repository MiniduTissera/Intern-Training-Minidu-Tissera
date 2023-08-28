package com.minidu.person;

import com.minidu.common.Drawer.Drawer;
import com.minidu.common.Theme;
import com.minidu.smileface.Face;
import com.minidu.treev5.Tree;

public class Application {

    public static void main(String[] args) {

        //add theme number (1,2,3)
        PersonBuilder pb = new PersonBuilder();
        Theme theme = new Theme();

        Face face = pb.buildPersonFace();
        Tree tree = pb.buildPersonBody();
        Drawer drawer = new Drawer();

        drawer.draw(face.getCircle());
        drawer.draw(face.getCurvedLines());
        drawer.draw(tree.getBranches());
        drawer.draw(tree.getTrunks());


        drawer.displayFrame();


    }

}
