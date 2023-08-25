package com.minidu.person;


import com.minidu.common.Theme;
import com.minidu.smileface.Face;
import com.minidu.smileface.FaceBuilder;
import com.minidu.treev5.Tree;
import com.minidu.treev5.TreeBuilder;

public class PersonBuilder {





    public Face buildPersonFace(){

        FaceBuilder fb = new FaceBuilder();

        Face face = new Face();
        Theme theme = new Theme();

        face.addCircle(fb.buildBigCircle(13,25,8));
        face.addCircle(fb.buildSmallCircle(10,22,2));
        face.addCircle(fb.buildSmallCircle(10,28,2));

        face.addCurvedLine(fb.buildCurvedLine(13,50,4));

        return face;

    }

    public Tree buildPersonBody(){

        TreeBuilder tb = new TreeBuilder();

        Tree tree = new Tree();

        tree.addTrunk(tb.buildTrunk(19,44,14,16));
        tree.addBranch(tb.buildBranch(13,21,20,2,23));
        tree.addBranch(tb.buildBranch(13,80,160,2,23));
        
        tree.addBranch(tb.buildBranch(34,57,45,3,15));
        tree.addBranch(tb.buildBranch(34,44,135,3,15));



        return  tree;


    }


    public Face buildPersonFace2D(){

        FaceBuilder fb = new FaceBuilder();

        Face face = new Face();


        face.addCircle(fb.buildBigCircle(8,13,25));
        face.addCircle(fb.buildSmallCircle(10,22,2));
        face.addCircle(fb.buildSmallCircle(10,28,2));

        face.addCurvedLine(fb.buildCurvedLine(13,50,4));

        return face;

    }

    public Tree buildPersonBody2D(){

        TreeBuilder tb = new TreeBuilder();

        Tree tree = new Tree();

        tree.addTrunk(tb.buildTrunk(330,195,80,200));

        tree.addBranch(tb.buildBranch(520,270,60,20,140));
        tree.addBranch(tb.buildBranch(520,200,120,20,140));

        tree.addBranch(tb.buildBranch(280,110,45,20,120));
        tree.addBranch(tb.buildBranch(280,360,135,20,120));



        return  tree;


    }








}
