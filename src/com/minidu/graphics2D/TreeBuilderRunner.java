package com.minidu.graphics2D;

import com.minidu.common.Drawer.Leaf;
import com.minidu.common.Drawer.Line;
import com.minidu.common.Drawer.Rectangle;
import com.minidu.common.Drawer.Shape;
import com.minidu.treev5.Tree;
import com.minidu.treev5.TreeBuilder;

import java.util.ArrayList;
import java.util.Collection;

public class TreeBuilderRunner {
    public static Tree buildTree() {
        TreeBuilder treeBuilder = new TreeBuilder();
        return treeBuilder.buildTree();
    }
}
