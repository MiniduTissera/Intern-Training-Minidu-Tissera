package com.minidu.treev5;


import com.minidu.common.Drawer.Drawer;

public class Application {

    public static void main(String[] args) {

        //add theme number (1,2,3)
        TreeBuilder treeBuilder = new TreeBuilder();
        Tree tree = treeBuilder.buildTree();
        Drawer drawer = new Drawer();


        drawer.draw(tree.getTrunks());


        drawer.draw(tree.getLeaves());
        drawer.draw(tree.getBranches());

        drawer.displayframe();


    }
}
