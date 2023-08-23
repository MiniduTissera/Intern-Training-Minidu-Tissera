package com.minidu.graphics2D;

import com.minidu.common.Drawer.Circle;
import com.minidu.common.Drawer.CurvedLine;
import com.minidu.common.Drawer.Leaf;
import com.minidu.treev5.Tree;
import com.minidu.treev5.TreeBuilder;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class MainProgram {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Collection<Shape> items = new ArrayList<>(); // Use your custom Shape class here

            // Adding a Circle shape

//            TreeBuilder tb = new TreeBuilder();
//            tb.buildTrunk(100,100,50,50);

            items.add(new Circle(50, 200, 400, "#FF0000"));

            DrawerGUI drawerGUI = new DrawerGUI(items);

            JFrame frame = new JFrame("Drawer GUI");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(drawerGUI);
            frame.setVisible(true);

        });
    }
}
