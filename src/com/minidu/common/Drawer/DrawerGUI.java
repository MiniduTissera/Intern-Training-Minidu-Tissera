package com.minidu.common.Drawer;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class DrawerGUI extends JPanel {

    private final Collection<Shape> items;

    private final boolean useRandomLeafColors; // Add this field

    public DrawerGUI(Collection<Shape> items, boolean useRandomLeafColors) {
        this.items = items;
        this.useRandomLeafColors = useRandomLeafColors;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        drawShape(g2d);


    }


    public void drawShape(Graphics2D g2d)
    {

        Random random = new Random();


        if (items != null) {

            for (Shape shape : items) {

                switch (shape.getType()) {
                    case RECTANGLE -> {
                        Rectangle rectangle = (Rectangle) shape;
                        Color brown = new Color(139, 69, 19);
                        g2d.setColor(brown);
                        g2d.fillRect(rectangle.getCol(), rectangle.getRow(), rectangle.getWidth(), rectangle.getHeight());
                    }

                    case LEAF -> {
                        Leaf leaf = (Leaf) shape;
                        int leafSize = (int) (30 * leaf.getRadius());
                        Color leafColor;
                        if (useRandomLeafColors) {
                            // Generate a random number (0 or 1) to choose a color
                            int colorChoice = random.nextInt(2);
                            leafColor = (colorChoice == 0) ? Color.green : Color.yellow;
                        } else {
                            // Use a fixed color for leaves in the other program
                            leafColor = Color.BLACK; // or any other fixed color
                        }
                        g2d.setColor(leafColor);
                        g2d.fillOval(leaf.getCol(), leaf.getRow(), leafSize, leafSize);
                    }
                    case CURVED_LINE -> {
                        CurvedLine curvedLine = (CurvedLine) shape;
                        Color lineColor = Color.black;
                        g2d.setColor(lineColor);
                        for (int angle = 0; angle < 180; angle++) {
                            double radians = Math.toRadians(angle);
                            int x = (int) Math.round(curvedLine.getCol() + curvedLine.getRadius() * Math.cos(radians));
                            int y = (int) Math.round(curvedLine.getRow() + curvedLine.getRadius() * Math.sin(radians));

                            g2d.drawLine(curvedLine.getCol(), curvedLine.getRow(), x, y);
                        }
                    }
                    case CIRCLE -> {
                        Circle circle = (Circle) shape;
                        int centerX = circle.getRow();
                        int centerY = circle.getCol();
                        double radius = circle.getRadius();
                        g2d.setColor(Color.yellow);
                        g2d.fillOval((int) (centerX - radius), (int) (centerY - radius), (int) (radius * 2), (int) (radius * 2));
                    }
                    case LINE -> {
                        Line line = (Line) shape;
                        Color brown2 = new Color(139, 69, 19);
                        g2d.setColor(brown2);
                        g2d.setStroke(new BasicStroke(line.getThickness()));
                        int startX = line.getCol();
                        int startY = line.getRow();
                        int endX = (int) (startX + line.getLength() * Math.cos(Math.toRadians(line.getAngle())));
                        int endY = (int) (startY + line.getLength() * Math.sin(Math.toRadians(line.getAngle())));
                        g2d.drawLine(startX, startY, endX, endY);
                    }
                    case SMALL_LEAF -> {
                        Smallleaf smallleaf = (Smallleaf) shape;
                        int leafSize = (int) (30 * smallleaf.getRadius());
                        Color leafColor;
                        if (useRandomLeafColors) {
                            // Generate a random number (0 or 1) to choose a color
                            int colorChoice = random.nextInt(2);
                            leafColor = (colorChoice == 0) ? Color.green : Color.yellow;
                        } else {
                            // Use a fixed color for leaves in the other program
                            leafColor = Color.BLACK; // or any other fixed color
                        }
                        g2d.setColor(leafColor);
                        g2d.fillOval(smallleaf.getCol(), smallleaf.getRow(), leafSize, leafSize);
                    }
                }
            }
        }


    }

    public void drawRectangle(Graphics2D g2d,Shape shape){

        Rectangle rectangle = (Rectangle) shape;
        Color brown = new Color(139, 69, 19);
        g2d.setColor(brown);
        g2d.fillRect(rectangle.getCol(), rectangle.getRow(), rectangle.getWidth(), rectangle.getHeight());

    }


}
