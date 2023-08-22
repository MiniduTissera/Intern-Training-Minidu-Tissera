package com.minidu.smileface;

import com.minidu.common.Drawer.Circle;
import com.minidu.common.Drawer.CurvedLine;
import com.minidu.common.Drawer.Shape;

import java.util.ArrayList;
import java.util.Collection;

public class Face {

    private Collection<Shape> circles = new ArrayList<>();
    private Collection<Shape> curvedLines = new ArrayList<>();

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

}
