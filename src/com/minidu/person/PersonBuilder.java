package com.minidu.person;


import com.minidu.common.Theme;
import com.minidu.smileface.Face;
import com.minidu.smileface.FaceBuilder;
import com.minidu.treev5.Tree;
import com.minidu.treev5.TreeBuilder;

public class PersonBuilder {


    public Face buildPersonFace() {

        FaceBuilder fb = new FaceBuilder();

        Face face = new Face();
        Theme theme = new Theme();

        face.addCircle(FaceBuilder.buildBigCircle(13, 25, 8));
        face.addCircle(FaceBuilder.buildSmallCircle(10, 22, 2));
        face.addCircle(FaceBuilder.buildSmallCircle(10, 28, 2));

        face.addCurvedLine(FaceBuilder.buildCurvedLine(13, 50, 4));

        return face;

    }

    public Tree buildPersonBody() {

        TreeBuilder tb = new TreeBuilder();

        Tree tree = new Tree();

        tree.addTrunk(TreeBuilder.buildTrunk(19, 44, 14, 16));
        tree.addBranch(TreeBuilder.buildBranch(13, 21, 20, 2, 23));
        tree.addBranch(TreeBuilder.buildBranch(13, 80, 160, 2, 23));

        tree.addBranch(TreeBuilder.buildBranch(34, 57, 45, 3, 15));
        tree.addBranch(TreeBuilder.buildBranch(34, 44, 135, 3, 15));


        return tree;


    }



    public Tree buildPersonBody2D() {

        TreeBuilder tb = new TreeBuilder();

        Tree tree = new Tree();

        tree.addTrunk(TreeBuilder.buildTrunk(330, 195, 80, 200));

        tree.addBranch(TreeBuilder.buildBranch(520, 270, 60, 20, 140));
        tree.addBranch(TreeBuilder.buildBranch(520, 200, 120, 20, 140));

        tree.addBranch(TreeBuilder.buildBranch(280, 110, 45, 20, 120));
        tree.addBranch(TreeBuilder.buildBranch(280, 360, 135, 20, 120));


        return tree;


    }


}
