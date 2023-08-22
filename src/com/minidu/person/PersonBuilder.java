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

        face.addCircle(fb.buildBigCircle(8,13,25));
        face.addCircle(fb.buildSmallCircle(10,22));
        face.addCircle(fb.buildSmallCircle(10,28));

        face.addCurvedLine(fb.buildCurvedLine(13,50));

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





}
