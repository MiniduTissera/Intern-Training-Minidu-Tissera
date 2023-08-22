package com.minidu.treev5;

import com.minidu.common.Drawer.Leaf;
import com.minidu.common.Drawer.Line;
import com.minidu.common.Drawer.Rectangle;
import com.minidu.common.Drawer.Shape;

import java.util.ArrayList;
import java.util.Collection;

public class Tree {

    private Collection<Shape> branches = new ArrayList<>();
    private Collection<Shape> leaves = new ArrayList<>();
    private Collection<Shape> rectangles = new ArrayList<>();

    public void addBranch(Line line) {
        branches.add(line);
    }

    public Collection<Shape> getBranches() {
        return branches;
    }

    public void addLeaf(Leaf leaf) {
        leaves.add(leaf);
    }

    public Collection<Shape> getLeaves() {
        return leaves;
    }

    public void addTrunk(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public Collection<Shape> getTrunks() {
        return rectangles;
    }
}

