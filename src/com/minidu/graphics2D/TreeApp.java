package com.minidu.graphics2D;

import com.minidu.common.Drawer.DrawerGUI;
import com.minidu.common.Drawer.Shape;
import com.minidu.treev5.Tree;
import com.minidu.treev5.TreeBuilder;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class TreeApp {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Tree tree = TreeBuilder.buildTree2D();



            // Combine all shapes into a single collection
            Collection<Shape> allShapes = new ArrayList<>();

            allShapes.addAll(tree.getLeaves());
            allShapes.addAll(tree.getBranches());
            allShapes.addAll(tree.getTrunks());

            allShapes.addAll(tree.getSmallLeaf());


            boolean useRandomLeafColors = true; // Set to true or false

            DrawerGUI drawerGUI = new DrawerGUI(allShapes, useRandomLeafColors);

            JFrame frame = new JFrame("Tree Drawer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.add(drawerGUI);
            frame.setVisible(true);

        });
    }
}
