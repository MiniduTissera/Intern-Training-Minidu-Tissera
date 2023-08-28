package com.minidu.treev5;

import com.minidu.common.Drawer.*;

import java.util.ArrayList;
import java.util.Collection;

public class Tree {

    private final Collection<Shape> branches = new ArrayList<>();
    private final Collection<Shape> leaves = new ArrayList<>();
    private final Collection<Shape> smallLeaves = new ArrayList<>();
    private final Collection<Shape> rectangles = new ArrayList<>();

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

    public void addSmallLeaf(Smallleaf smallleaf) {
        smallLeaves.add(smallleaf);
    }

    public Collection<Shape> getSmallLeaf() {
        return smallLeaves;
    }

    public void addTrunk(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public Collection<Shape> getTrunks() {
        return rectangles;
    }
}

