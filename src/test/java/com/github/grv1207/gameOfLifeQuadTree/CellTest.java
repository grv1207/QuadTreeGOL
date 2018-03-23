package com.github.grv1207.gameOfLifeQuadTree;

import org.junit.Test;

import junit.framework.TestCase;

public class CellTest extends TestCase{

    Cell cell1 = new Cell(1,2,true);
    Cell cell2 = new Cell(1,2,true);

    @Test
    public void testequal() {
    assertEquals(cell1.equals(cell2), true);

    }
    @Test
    public void testhashCode() {
        assertEquals(cell1.hashCode()==cell2.hashCode(), true);
    }
}