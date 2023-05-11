/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Resources.InvalidPointException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Steven.Cardona
 */
public class Attempt {

    private ArrayList<Player> players;
    private Board board;
    private Player currentPlayer;
    private Player playerWinner;

    public Attempt(ArrayList<Player> players, Board board) {
        this.players = players;
        this.board = board;
        this.currentPlayer = players.get(0);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void nextTurn() {
        ArrayList<Player> copyPlayers = (ArrayList<Player>) players.clone();
        copyPlayers.remove(currentPlayer);
        currentPlayer = copyPlayers.get(0);
    }

    public void setSymbolInBoard(String symbol, int posX, int posY) {
        try {
            board.setFigure(posX, posY, symbol);
        } catch (InvalidPointException ex) {
            Logger.getLogger(Attempt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}