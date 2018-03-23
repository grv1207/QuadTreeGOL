package com.github.grv1207.gameOfLifeQuadTree;

import com.github.varunpant.quadtree.QuadTree;
import junit.framework.TestCase;
import org.junit.Test;
import scala.Tuple2;

import java.util.ArrayList;

public class BoardTest extends TestCase {
    Board board = new Board(10,10);



    @Test
    public void testInitializeBoard() {
        ArrayList<Tuple2<Double,Double>> testLiveCell = new ArrayList<>();
        testLiveCell.add(new Tuple2<>(0.0,0.0));
        testLiveCell.add(new Tuple2<>(0.0,1.0));
        testLiveCell.add(new Tuple2<>(0.0,2.0));
        testLiveCell.add(new Tuple2<>(0.0,3.0));
        QuadTree<Cell> testBoard =  board.initializeBoard(testLiveCell);
        System.out.println(testBoard.getCount());
       assertEquals(testBoard.getCount(),4);
       testBoard.getValues().stream().forEach(System.out::println);
    }
}