package com.github.grv1207.gameOfLifeQuadTree;

public class Cell {
    private static double coordX;
    private static double coordY;
    private static boolean isAlive;

    public Cell(double coordX, double coordY, boolean isAlive){
        this.coordX = coordX;
        this.coordY = coordY;
        this.isAlive = isAlive;

    }
    public  Cell(boolean isAlive){
        this.isAlive = isAlive;
    }

    public static double getCoordX() {
        return coordX;
    }

    public static void setCoordX(int coordX) {
        Cell.coordX = coordX;
    }

    public static double getCoordY() {
        return coordY;
    }

    public static void setCoordY(int coordY) {
        Cell.coordY = coordY;
    }

    public static boolean getIsAlive() {
        return isAlive;
    }

    public static void setIsAlive(boolean isAlive) {
        Cell.isAlive = isAlive;
    }


    @Override
    public int hashCode() {

        int hash = 7;
        hash = (int) (31 * hash + getCoordX() + 31 * hash + getCoordY());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Cell) || obj == null ) {
            return false;
        }

        Cell cell = (Cell) obj;

        return (cell.getCoordX() == this.coordX &&
                cell.getCoordY() == this.coordY &&
                cell.getIsAlive() == this.isAlive);
    }

    @Override
    public String toString() {
        return "{ Xcoord :"+getCoordX()  + " Ycoord :"+getCoordY()+ " status:" +getIsAlive() + "}";
    }
}
