package com.minidu.treev5;

import com.minidu.common.Drawer.Leaf;
import com.minidu.common.Drawer.Line;
import com.minidu.common.Drawer.Rectangle;

public class TreeBuilder {

    private int theme;

    String color = "\u001B[48;2;139;69;19m \u001B[0m";

    String lcolor = "\u001B[42m \u001B[0m";

    public TreeBuilder(int theme) {
        this.theme = theme;
    }

    public Rectangle buildTrunk(int row, int col, int width, int height) {

        switch (theme) {
            case 1://brown
                color = "\u001B[48;2;139;69;19m \u001B[0m";
                break;
            case 2://blue
                color = "\u001B[44m \u001B[0m";
                break;
            case 3://green
                color = "\u001B[42m \u001B[0m";
                break;
            default://brown
                color = "\u001B[48;2;139;69;19m \u001B[0m";
                break;
        }

        Rectangle rectangle = new Rectangle(width, height, row, col,color);
        return rectangle;
    }

    public Line buildBranch(int row, int col, int angle, int thickness, int length){

        switch (theme) {
            case 1://brown
                color = "\u001B[48;2;139;69;19m \u001B[0m";
                break;
            case 2://green
                color = "\u001B[42m \u001B[0m";
                break;
            case 3://blue
                color = "\u001B[44m \u001B[0m";
                break;
            default://brown
                color = "\u001B[48;2;139;69;19m \u001B[0m";
                break;
        }

        Line line = new Line( row, col, angle,  thickness,length,color);
        return line;

    }

    public Leaf buildLeaf(int col, int row, int depth){

        switch (theme) {
            case 1://green
                lcolor = "\u001B[42m \u001B[0m";
                break;
            case 2://yellow
                lcolor = "\u001b[48;2;255;255;0m \u001b[0m";
                break;
            case 3://blue
                lcolor = "\u001B[40m \u001B[0m";
                break;
            default://green
                lcolor = "\u001B[42m \u001B[0m";
                break;
        }

        Leaf leaf1 = new Leaf(1.8,row,col,lcolor);

      return leaf1;


    }

    public Tree buildTree(){
        Tree tree = new Tree();

        tree.addTrunk(buildTrunk(18,26,9,9));


        tree.addBranch(buildBranch(10,14,30,4,15));
        tree.addBranch(buildBranch(12,43,150,5,10));
        tree.addBranch(buildBranch(15,29,30,3,4));
        tree.addBranch(buildBranch(9,30,150,3,10));

        tree.addLeaf(buildLeaf(12,8, 0));
        tree.addLeaf(buildLeaf(16,6,1));
        tree.addLeaf(buildLeaf(17,10,2));
        tree.addLeaf(buildLeaf(22,11,3));
        tree.addLeaf(buildLeaf(21,7,4));
        tree.addLeaf(buildLeaf(23,5,1));
        tree.addLeaf(buildLeaf(17,14,0));
        tree.addLeaf(buildLeaf(11,15,1));
        tree.addLeaf(buildLeaf(18,18,2));
        tree.addLeaf(buildLeaf(40,18,3));
        tree.addLeaf(buildLeaf(9,11,0));
        tree.addLeaf(buildLeaf(28,15,1));
        tree.addLeaf(buildLeaf(36,16,2));
        tree.addLeaf(buildLeaf(39,12,3));
        tree.addLeaf(buildLeaf(33,16,0));
        tree.addLeaf(buildLeaf(27,12,1));
        tree.addLeaf(buildLeaf(33,12,2));
        tree.addLeaf(buildLeaf(30,9,3));
        tree.addLeaf(buildLeaf(35,7,0));
        tree.addLeaf(buildLeaf(39,8,1));
        tree.addLeaf(buildLeaf(39,6,2));
        tree.addLeaf(buildLeaf(32,6,3));
        tree.addLeaf(buildLeaf(27,6,0));
        tree.addLeaf(buildLeaf(44,10,1));
        tree.addLeaf(buildLeaf(47,12,2));
        tree.addLeaf(buildLeaf(47,16,3));
        tree.addLeaf(buildLeaf(49,8,0));
        tree.addLeaf(buildLeaf(44,6,1));
        tree.addLeaf(buildLeaf(44,15,2));
        tree.addLeaf(buildLeaf(25,18,3));
        tree.addLeaf(buildLeaf(20,16,3));







        return tree;
    }


}
