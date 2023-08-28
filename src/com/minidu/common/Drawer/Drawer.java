package com.minidu.common.Drawer;

import com.minidu.common.Grid;

import java.util.Collection;

public class Drawer {


    int gridHeight = 50;
    int gridWidth = 100;

    Grid canvas = new Grid(gridHeight, gridWidth);



    public Drawer() {
        super();
    }

    public void draw(Collection<Shape> items) {

        for (Object item : items) {
            if (item instanceof Circle) {
                drawCircleOnCanvas((Circle) item);
            } else if (item instanceof CurvedLine) {
                drawCurvedLineOnCanvas((CurvedLine) item);
            } else if (item instanceof Rectangle) {
                drawTrunkOnCanvas((Rectangle) item);
            } else if (item instanceof Line) {
                drawBranchOnCanvas((Line) item);
            } else if (item instanceof Leaf) {
                drawLeafOnCanvas((Leaf) item);
            }

        }


    }

    public void displayFrame() {

        canvas.display(gridHeight, gridWidth);

    }

    public void drawTrunkOnCanvas(Rectangle rectangle) {

        for (int trow = rectangle.getRow(); trow < rectangle.getRow() + rectangle.getHeight(); trow++) {
            for (int tcol = rectangle.getCol(); tcol < rectangle.getCol() + rectangle.getWidth(); tcol++) {
                canvas.getGrid()[trow][tcol] = rectangle.getColor();
            }
        }

    }


    public void drawBranchOnCanvas(Line line) {


        double radians = Math.toRadians(line.getAngle());

        int halfThickness = line.getThickness() / 2;

        for (int i = 0; i <= line.getLength(); i++) {
            for (int t = -halfThickness; t <= halfThickness; t++) {
                double offset = t * 0.5; // Adjust this factor as needed
                int lcol = (int) Math.round(line.getCol() + (i * Math.cos(radians)) + (offset * Math.sin(radians)));
                int lrow = (int) Math.round(line.getRow() + (i * Math.sin(radians)) - (offset * Math.cos(radians)));

                canvas.getGrid()[lrow][lcol] = line.getColor();
            }
        }


    }

    public void drawLeafOnCanvas(Leaf leaf) {


        for (int angle = 0; angle < 360; angle++) {
            double radians = Math.toRadians(angle);
            int x = (int) Math.round(leaf.getCol() + leaf.getRadius() * Math.cos(radians));
            int y = (int) Math.round(leaf.getRow() + leaf.getRadius() * Math.sin(radians));

            plotPixell(canvas.getGrid(), x, y, leaf);
        }


    }

    private void plotPixell(String[][] grid, int x, int y, Leaf leaf) {
        if (x >= 0 && x < grid[0].length && y >= 0 && y < grid.length) {
            grid[y][x] = leaf.getColor();
        }
    }


    public void drawCircleOnCanvas(Circle circle) {

        int centerX = circle.getCol();
        int centerY = circle.getRow();
        double radius = circle.getRadius();


        for (int y = (int) (centerY - radius + 1); y < centerY + radius; y++) {
            for (int x = (int) (centerX - radius + 1); x < centerX + radius; x++) {
                double distanceSquared = (x - centerX) * (x - centerX) + (y - centerY) * (y - centerY);
                if (distanceSquared <= radius * radius) {

                    int z = x * 2;


                    plotPixel(canvas.getGrid(), z, y, circle);
                }
            }
        }

        for (int y = (int) (centerY - radius + 1); y < centerY + radius; y++) {
            for (int x = (int) (centerX - radius + 1); x < centerX + radius; x++) {
                double distanceSquared = (x - centerX) * (x - centerX) + (y - centerY) * (y - centerY);
                if (distanceSquared <= radius * radius) {

                    int z = x * 2 + 1;


                    plotPixel(canvas.getGrid(), z, y, circle);
                }
            }
        }


    }

    private void plotPixel(String[][] grid, int x, int y, Circle circle) {
        if (x >= 0 && x < grid[0].length && y >= 0 && y < grid.length) {
            grid[y][x] = circle.getColor();
        }
    }

    public void drawCurvedLineOnCanvas(CurvedLine curvedLine) {

        for (int angle = 0; angle < 180; angle++) {
            double radians = Math.toRadians(angle);
            int x = (int) Math.round(curvedLine.getCol() + curvedLine.getRadius() * Math.cos(radians));
            int y = (int) Math.round(curvedLine.getRow() + curvedLine.getRadius() * Math.sin(radians));

            plotPixel2(canvas.getGrid(), x, y, curvedLine);
        }

    }

    private void plotPixel2(String[][] grid, int x, int y, CurvedLine curvedLine) {
        if (x >= 0 && x < grid[0].length && y >= 0 && y < grid.length) {
            grid[y][x] = curvedLine.getColor();
        }
    }

}
