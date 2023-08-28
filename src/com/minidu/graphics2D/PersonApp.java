package com.minidu.graphics2D;

import com.minidu.common.Drawer.DrawerGUI;
import com.minidu.common.Drawer.Shape;
import com.minidu.person.PersonBuilder;
import com.minidu.smileface.Face;
import com.minidu.smileface.FaceBuilder;
import com.minidu.treev5.Tree;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class PersonApp {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            Face face = FaceBuilder.buildFace2D();
            PersonBuilder pb = new PersonBuilder();
            Tree tree = pb.buildPersonBody2D();



            // Combine all shapes into a single collection
            Collection<Shape> allShapes = new ArrayList<>();

            allShapes.addAll(face.getCircle());
            allShapes.addAll(face.getCurvedLines());
            allShapes.addAll(face.getLeaf());
            allShapes.addAll(tree.getTrunks());
            allShapes.addAll(tree.getBranches());

            boolean useRandomLeafColors = false; // Set to true or false

            DrawerGUI drawerGUI = new DrawerGUI(allShapes, useRandomLeafColors);

            JFrame frame = new JFrame("Tree Drawer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.add(drawerGUI);
            frame.setVisible(true);
        });
    }


}
