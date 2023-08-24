package com.minidu.graphics2D;

import com.minidu.common.Drawer.Leaf;
import com.minidu.common.Drawer.Line;
import com.minidu.common.Drawer.Rectangle;
import com.minidu.common.Drawer.Shape;
import com.minidu.treev5.TreeBuilder;
import com.minidu.treev5.Tree;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

public class DrawerGUI extends JPanel {

    private Collection<Shape> branches;
    private Collection<Shape> leaves;
    private Collection<Shape> trunks;

    public DrawerGUI(Collection<Shape> branches, Collection<Shape> leaves, Collection<Shape> trunks) {
        this.branches = branches;
        this.leaves = leaves;
        this.trunks = trunks;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;




        if (trunks != null) {
            for (Shape trunk : trunks) {
                Rectangle rectangle = (Rectangle) trunk;
                Color brown = new Color(139, 69, 19);

                g2d.setColor(brown); // Set color to brown
                g2d.fillRect(rectangle.getCol(), rectangle.getRow(), rectangle.getWidth(), rectangle.getHeight());
            }
        }

        if (branches != null) {
            for (Shape branch : branches) {
                Line line = (Line) branch;
                Color brown = new Color(139, 69, 19);

                g2d.setColor(brown); // Set color to brown
                g2d.setStroke(new BasicStroke(line.getThickness()));

                int startX = line.getCol(); // Starting point X-coordinate
                int startY = line.getRow(); // Starting point Y-coordinate

                // Calculate the ending coordinates based on the angle and length
                int endX = (int) (startX + line.getLength() * Math.cos(Math.toRadians(line.getAngle())));
                int endY = (int) (startY + line.getLength() * Math.sin(Math.toRadians(line.getAngle())));

                g2d.drawLine(startX, startY, endX, endY);
            }
        }



        if (leaves != null) {
            for (Shape leaf : leaves) {
                Leaf l = (Leaf) leaf;
                g2d.setColor(Color.green);
                int leafSize = (int) (30 * l.getRadius());
                g2d.fillOval(l.getCol(), l.getRow(), leafSize, leafSize);
            }
        }
    }


}
