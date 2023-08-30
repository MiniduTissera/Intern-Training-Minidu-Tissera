package com.minidu.treev5;

import com.minidu.common.Drawer.*;
import com.minidu.common.Theme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class TreeBuilder {


    static Theme theme = new Theme();

    static String themeColor1 = theme.theme1Trunkcolor();
    static String themeColor2 = theme.theme1Leafcolor();


    public static Rectangle buildTrunk(int row, int col, int width, int height) {


        return new Rectangle(width, height, row, col, themeColor1);
    }

    public static Line buildBranch(int row, int col, int angle, int thickness, int length) {


        return new Line(row, col, angle, thickness, length, themeColor1);

    }

    public static Leaf buildLeaf(int col, int row, int depth) {


        return new Leaf(1.8, row, col, themeColor2, depth);


    }

    public static Smallleaf buildSmallLeaf(int col, int row, int depth) {


        return new Smallleaf(1.5, row, col, themeColor2,1);


    }

    public static Tree buildTree2D() {
        Tree tree = new Tree();





        tree.addLeaf(buildLeaf(130, 250, 1));

        tree.addLeaf(buildLeaf(80, 210, 3));
        tree.addLeaf(buildLeaf(50, 150, 3));

        tree.addLeaf(buildLeaf(120, 150, 3));

        tree.addLeaf(buildLeaf(50, 85, 1));
        tree.addLeaf(buildLeaf(100, 40, 1));
        tree.addLeaf(buildLeaf(160, 25, 1));
        tree.addLeaf(buildLeaf(230, 20, 1));
        tree.addLeaf(buildLeaf(310, 40, 1));


        tree.addLeaf(buildLeaf(110, 150, 3));
        tree.addLeaf(buildLeaf(230, 170, 3));
        tree.addLeaf(buildLeaf(175, 190, 3));
        tree.addLeaf(buildLeaf(200, 110, 3));
        tree.addLeaf(buildLeaf(140, 90, 3));
        tree.addLeaf(buildLeaf(260, 70, 1));
        tree.addLeaf(buildLeaf(280, 125, 1));

        tree.addLeaf(buildLeaf(275, 200, 3));


        tree.addLeaf(buildLeaf(270, 253, 1));
        tree.addLeaf(buildLeaf(330, 220, 3));
        tree.addLeaf(buildLeaf(360, 170, 3));
        tree.addLeaf(buildLeaf(360, 100, 1));

//
//        tree.addSmallLeaf(buildSmallLeaf(300,120,1));
//        tree.addSmallLeaf(buildSmallLeaf(250,120,1));
//        tree.addSmallLeaf(buildSmallLeaf(150,190,1));
//        tree.addSmallLeaf(buildSmallLeaf(120,130,1));
//        tree.addSmallLeaf(buildSmallLeaf(200,40,1));
//        tree.addSmallLeaf(buildSmallLeaf(270,40,1));
//
//        tree.addSmallLeaf(buildSmallLeaf(250,230,1));
//        tree.addSmallLeaf(buildSmallLeaf(200,250,1));
//        tree.addSmallLeaf(buildSmallLeaf(300,170,1));
//        tree.addSmallLeaf(buildSmallLeaf(100,170,1));
//        tree.addSmallLeaf(buildSmallLeaf(100,75,1));
//        tree.addSmallLeaf(buildSmallLeaf(80,120,1));
//        tree.addSmallLeaf(buildSmallLeaf(130,220,1));
//        tree.addSmallLeaf(buildSmallLeaf(320,90,1));
//        tree.addSmallLeaf(buildSmallLeaf(340,140,1));
//        tree.addSmallLeaf(buildSmallLeaf(200,170,1));


//        tree.addSmallLeaf(buildSmallLeaf(200,75,1));


        tree.addTrunk(buildTrunk(250, 190, 80, 200));

        tree.addBranch(buildBranch(145, 140, 60, 20, 120));
        tree.addBranch(buildBranch(145, 320, 120, 20, 120));

        tree.addBranch(buildBranch(140, 210, 120, 15, 60));





        return tree;
    }

    public Tree buildTree() {
        Tree tree = new Tree();


        tree.addTrunk(buildTrunk(18, 26, 9, 9));


        tree.addBranch(buildBranch(10, 14, 30, 4, 15));
        tree.addBranch(buildBranch(12, 43, 150, 5, 10));
        tree.addBranch(buildBranch(15, 29, 30, 3, 4));
        tree.addBranch(buildBranch(9, 30, 150, 3, 10));

        tree.addLeaf(buildLeaf(12, 8, 0));
        tree.addLeaf(buildLeaf(16, 6, 1));
        tree.addLeaf(buildLeaf(17, 10, 2));
        tree.addLeaf(buildLeaf(22, 11, 3));
        tree.addLeaf(buildLeaf(21, 7, 4));
        tree.addLeaf(buildLeaf(23, 5, 1));
        tree.addLeaf(buildLeaf(17, 14, 0));
        tree.addLeaf(buildLeaf(11, 15, 1));
        tree.addLeaf(buildLeaf(18, 18, 2));
        tree.addLeaf(buildLeaf(40, 18, 3));
        tree.addLeaf(buildLeaf(9, 11, 0));
        tree.addLeaf(buildLeaf(28, 15, 1));
        tree.addLeaf(buildLeaf(36, 16, 2));
        tree.addLeaf(buildLeaf(39, 12, 3));
        tree.addLeaf(buildLeaf(33, 16, 0));
        tree.addLeaf(buildLeaf(27, 12, 1));
        tree.addLeaf(buildLeaf(33, 12, 2));
        tree.addLeaf(buildLeaf(30, 9, 3));
        tree.addLeaf(buildLeaf(35, 7, 0));
        tree.addLeaf(buildLeaf(39, 8, 1));
        tree.addLeaf(buildLeaf(39, 6, 2));
        tree.addLeaf(buildLeaf(32, 6, 3));
        tree.addLeaf(buildLeaf(27, 6, 0));
        tree.addLeaf(buildLeaf(44, 10, 1));
        tree.addLeaf(buildLeaf(47, 12, 2));
        tree.addLeaf(buildLeaf(47, 16, 3));
        tree.addLeaf(buildLeaf(49, 8, 0));
        tree.addLeaf(buildLeaf(44, 6, 1));
        tree.addLeaf(buildLeaf(44, 15, 2));
        tree.addLeaf(buildLeaf(25, 18, 3));
        tree.addLeaf(buildLeaf(20, 16, 3));




        return tree;
    }









}


