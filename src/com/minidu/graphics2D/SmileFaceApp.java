package com.minidu.graphics2D;


import com.minidu.common.Drawer.DrawerGUI;
import com.minidu.common.Drawer.Shape;
import com.minidu.smileface.Face;
import com.minidu.smileface.FaceBuilder;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class SmileFaceApp {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            Face face = FaceBuilder.buildFace2D();


            Collection<Shape> circles = face.getCircle();
            Collection<Shape> curvedLines = face.getCurvedLines();
            Collection<Shape> leaves = face.getLeaf();


            // Combine all shapes into a single collection
            Collection<Shape> allShapes = new ArrayList<>();
            allShapes.addAll(circles);
            allShapes.addAll(curvedLines);
            allShapes.addAll(leaves);

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
