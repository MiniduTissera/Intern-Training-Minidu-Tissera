package com.minidu.common;

public class Theme {


    private String color;


    public String theme1facecolor() {

        color = "\u001B[103m \u001B[0m";

        return color;

    }

    public String theme1eyecolor() {

        color = "\u001B[40m \u001B[0m";

        return color;

    }

    public String theme2facecolor() {

        color = "\u001B[42m \u001B[0m";

        return color;

    }

    public String theme2eyecolor() {

        color = "\u001B[103m \u001B[0m";

        return color;

    }

    public String theme1Trunkcolor() {

        color = "\u001B[48;2;139;69;19m \u001B[0m";

        return color;

    }


    public String theme1Leafcolor() {

        color = "\u001B[42m \u001B[0m";

        return color;

    }

    public String theme2Trunkcolor() {

        color = "\u001B[44m \u001B[0m";

        return color;

    }


    public String theme2Leafcolor() {

        color = "\u001B[43m \u001B[0m";

        return color;

    }


}
