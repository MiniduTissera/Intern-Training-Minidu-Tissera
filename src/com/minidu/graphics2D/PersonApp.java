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



            Collection<Shape> circles = face.getCircle();
            Collection<Shape> curvedLines = face.getCurvedLines();
            Collection<Shape> leaves = face.getLeaf();
            Collection<Shape> trunks = tree.getTrunks();
            Collection<Shape> branches = tree.getBranches();


            // Combine all shapes into a single collection
            Collection<Shape> allShapes = new ArrayList<>();
            allShapes.addAll(circles);
            allShapes.addAll(curvedLines);
            allShapes.addAll(leaves);
            allShapes.addAll(trunks);
            allShapes.addAll(branches);

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
