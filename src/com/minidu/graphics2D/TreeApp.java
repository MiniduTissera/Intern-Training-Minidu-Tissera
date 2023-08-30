package com.minidu.graphics2D;

import com.minidu.common.Drawer.DrawerGUI;
import com.minidu.common.Drawer.Leaf;
import com.minidu.common.Drawer.Shape;
import com.minidu.treev5.Tree;
import com.minidu.treev5.TreeBuilder;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class TreeApp {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            boolean useRandomLeafColors = true; // Set to true or false


            DrawerGUI drawerGUI = new DrawerGUI(pattern(), useRandomLeafColors);
            JFrame frame = new JFrame("Tree Drawer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.add(drawerGUI);
            frame.setVisible(true);


            //allShapes.addAll(tree.getSmallLeaf());


        });
    }

    public static Collection<Shape> pattern() {
        Tree tree = TreeBuilder.buildTree2D();

        Collection<Shape> allShapes = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                allShapes.addAll(tree.getTrunks());
            } else {
                Collection<Shape> shapes = tree.getLeaves();
                for (Shape shape : shapes) {
                    if (shape instanceof Leaf) {
                        Leaf leaf = (Leaf) shape;
                        int depth = leaf.getDepth();
                        if (depth == 1) {
                            allShapes.add(leaf);
                        }
                    }
                }
            }
        }

        allShapes.addAll(tree.getBranches());


        Collection<Shape> shapes = tree.getLeaves();
        for (Shape shape : shapes) {
            if (shape instanceof Leaf) {
                Leaf leaf = (Leaf) shape;
                int depth = leaf.getDepth();
                if (depth == 3) {
                    allShapes.add(leaf);
                }
            }
        }
                

        return allShapes;
    }


}
