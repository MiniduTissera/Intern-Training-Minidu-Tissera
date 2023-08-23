package com.minidu.graphics2D;

import com.minidu.common.Drawer.Circle;
import com.minidu.common.Drawer.CurvedLine;
import com.minidu.common.Drawer.Leaf;
import com.minidu.common.Drawer.Line;
import com.minidu.common.Drawer.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

public class DrawerGUI extends JPanel {

    private Collection<Shape> items;

    public DrawerGUI(Collection<Shape> items) {
        this.items = items;
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        for (Shape item : items) {
            if (item instanceof Circle) {
                drawCircleOnCanvas(g2d, (Circle) item);
            } else if (item instanceof CurvedLine) {
                drawCurvedLineOnCanvas(g2d, (CurvedLine) item);
            } else if (item instanceof Rectangle) {
                drawTrunkOnCanvas(g2d, (Rectangle) item);
            } else if (item instanceof Line) {
                drawBranchOnCanvas(g2d, (Line) item);
            } else if (item instanceof Leaf) {
                drawLeafOnCanvas(g2d, (Leaf) item);
            }
        }
    }

    private void drawTrunkOnCanvas(Graphics2D g2d, Rectangle rectangle) {
        g2d.setColor(Color.decode(rectangle.getColor()));
        g2d.fillRect(rectangle.getCol(), rectangle.getRow(), rectangle.getWidth(), rectangle.getHeight());
    }

    private void drawBranchOnCanvas(Graphics2D g2d, Line line) {
        g2d.setColor(Color.decode(line.getColor()));

        int x1 = line.getCol();
        int y1 = line.getRow();
        int x2 = x1 + line.getLength();
        int y2 = y1;

        g2d.drawLine(x1, y1, x2, y2);
    }


    private void drawLeafOnCanvas(Graphics2D g2d, Leaf leaf) {
        g2d.setColor(Color.decode(leaf.getColor()));

        int centerX = leaf.getCol();
        int centerY = leaf.getRow();
        int radius = (int) leaf.getRadius();

        // Calculate the top-left coordinates of the bounding box
        int x = centerX - radius;
        int y = centerY - radius;

        // Draw the leaf using g2d.fillOval(...)
        g2d.drawOval(x, y, 2 * radius, 2 * radius);
    }


    private void drawCircleOnCanvas(Graphics2D g2d, Circle circle) {
        g2d.setColor(Color.decode(circle.getColor()));

        int centerX = circle.getCol();
        int centerY = circle.getRow();
        int radius = (int) circle.getRadius();

        // Calculate the top-left coordinates of the bounding box
        int x = centerX - radius;
        int y = centerY - radius;

        // Draw the circle using g2d.drawOval(...)
        g2d.fillOval(x, y, 2 * radius, 2 * radius);
    }


    private void drawCurvedLineOnCanvas(Graphics2D g2d, CurvedLine curvedLine) {
        g2d.setColor(Color.decode(curvedLine.getColor()));

        int x = curvedLine.getCol();
        int y = curvedLine.getRow();
        int radius = (int) curvedLine.getRadius();

        int startAngle = 0;
        int arcAngle = 180; // Draw a semicircle

        // Draw the curved line using g2d.drawArc(...)
        g2d.drawArc(x - radius, y - radius, 2 * radius, 2 * radius, startAngle, arcAngle);
    }


}