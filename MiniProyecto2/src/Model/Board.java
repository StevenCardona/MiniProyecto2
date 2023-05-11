package Model;

import Resources.InvalidBoardSizeException;
import Resources.InvalidPointException;

public class Board {

    private static final int MIN_COORDINATE = 0;
    private static final int DEFAULT_BOARD_SIZE = 3;
    private String[][] figures;

    public Board() throws InvalidBoardSizeException {
        this.figures = new String[DEFAULT_BOARD_SIZE][DEFAULT_BOARD_SIZE];
    }

    public void resetBoard() {
        this.figures = new String[DEFAULT_BOARD_SIZE][DEFAULT_BOARD_SIZE];
    }

    public void setFigure(final int x, final int y, final String figure) throws InvalidPointException {
        if (checkCoordinates(x, y)) {
            figures[x][y] = figure;
        } else {
            throw new InvalidPointException();
        }
    }

    public String getFigure(final int x, final int y) throws InvalidPointException {
        if (checkCoordinates(x, y)) {
            return figures[x][y];
        } else {
            throw new InvalidPointException();
        }
    }

    public String[] getRow(final int x) throws InvalidPointException {
        if (checkCoordinate(x)) {
            return figures[x];
        } else {
            throw new InvalidPointException();
        }
    }

    public String[][] getFiguresArray() {
        return figures;
    }

    public int getRowLength(final int row) {
        return figures[row].length;
    }

    private boolean checkCoordinates(final int x, final int y) {
        return (checkCoordinate(x) && checkCoordinate(y));
    }

    public boolean checkCoordinate(final int coordinate) {
        return (coordinate >= MIN_COORDINATE && coordinate <= figures.length - 1);
    }

    @Override
    public String toString() {
        return "Board{" + "figures=" + figures[0] + " " + figures[1] + figures[2] + '}';
    }
}
