package com.minidu.smileface;

import com.minidu.common.Drawer.CurvedLine;
import com.minidu.common.Drawer.Shape;

import java.util.ArrayList;
import java.util.Collection;

public class Face {

    private final Collection<Shape> circles = new ArrayList<>();
    private final Collection<Shape> curvedLines = new ArrayList<>();
    private final Collection<Shape> leaves = new ArrayList<>();

    public void addCircle(Shape circle) {
        circles.add(circle);
    }

    public Collection<Shape> getCircle() {
        return circles;
    }

    public void addCurvedLine(CurvedLine curvedLine) {
        curvedLines.add(curvedLine);
    }

    public Collection<Shape> getCurvedLines() {
        return curvedLines;
    }


    public void addLeaf(Shape leaf) {
        leaves.add(leaf);
    }

    public Collection<Shape> getLeaf() {
        return leaves;
    }


}
