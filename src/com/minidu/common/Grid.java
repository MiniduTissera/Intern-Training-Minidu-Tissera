package com.minidu.common;

public class Grid {


        protected String [][] grid;

        public Grid(int rows, int columns) {
            grid = new String[rows][columns];
            initializeGrid(rows,columns);
        }



        private void initializeGrid(int rows, int columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    grid[i][j] = " ";
                }
            }
        }

        public void display(int rows, int columns) {

            for (int row = 0; row < rows -1; row++) {
                int starRow = row;    // Y-coordinate
                int starColumn = 0; // X-coordinate
                grid[starRow][starColumn] = "\u001B[41m \u001B[0m";
            }

            for (int column = 0; column < columns; column++) {
                int starRow = 0;    // Y-coordinate
                int starColumn = column; // X-coordinate
                grid[starRow][starColumn] = "\u001B[41m \u001B[0m";
            }

            for (int row = 0; row < rows -1; row++) {
                int starRow = row;    // Y-coordinate
                int starColumn = columns - 1; // X-coordinate
                grid[starRow][starColumn] = "\u001B[41m \u001B[0m";
            }

            for (int column = 0; column < columns; column++) {
                int starRow = rows -1;    // Y-coordinate
                int starColumn = column; // X-coordinate
                grid[starRow][starColumn] = "\u001B[41m \u001B[0m";
            }


            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(grid[i][j]);
                }
                System.out.println();
            }
        }




        public String[][] getGrid() {
            return grid;
        }



    


}
