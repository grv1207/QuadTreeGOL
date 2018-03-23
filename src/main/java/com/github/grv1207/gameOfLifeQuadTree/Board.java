package com.github.grv1207.gameOfLifeQuadTree;

import com.github.varunpant.quadtree.QuadTree;
import scala.Tuple2;

import java.util.ArrayList;

public class Board {
    private static final int[][] NEIGHBOURS =  {
        {-1, -1}, {-1, 0}, {-1, +1},
        { 0, -1},          { 0, +1},
        {+1, -1}, {+1, 0}, {+1, +1}};
    private static QuadTree<Cell> boardGrid ;
    private static int boardWidth;
    private static int boardBreadth;



    public Board(int boardWidth, int boardBreadth ) {
        this.boardBreadth = boardBreadth;
        this.boardWidth =  boardWidth;
        this.boardGrid =  new QuadTree<>(0, 0, getBoardWidth(), getBoardBreadth());
    }

    public QuadTree<Cell> initializeBoard(ArrayList<Tuple2<Double,Double>> initalCoordList){
        for (Tuple2<Double,Double> iniCoord : initalCoordList){
            this.boardGrid.set(iniCoord._1,iniCoord._2,new Cell(iniCoord._1,iniCoord._2,true));
        }
        return boardGrid;

    }



    public static int getBoardBreadth() {
        return boardBreadth;
    }


    public static QuadTree<Cell> getBoardGrid() {
        return boardGrid;
    }

    public static int getBoardWidth() {

        return boardWidth;
    }


}
