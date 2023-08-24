package com.minidu.graphics2D;

import com.minidu.common.Drawer.Shape;
import com.minidu.treev5.Tree;
import com.minidu.treev5.TreeBuilder;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class MainProgram {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            Tree tree = TreeBuilder.buildTree2D();

            Collection<Shape> branches = tree.getBranches();
            Collection<Shape> leaves = tree.getLeaves();
            Collection<Shape> trunks = tree.getTrunks();

            DrawerGUI drawerGUI = new DrawerGUI(branches, leaves, trunks);

            JFrame frame = new JFrame("Tree Drawer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.add(drawerGUI);
            frame.setVisible(true);
        });
    }

}
