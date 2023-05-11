/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Attempt;
import Model.Board;
import Model.Player;
import Resources.InvalidBoardSizeException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Steven.Cardona
 */
public class Game {

    private ArrayList<Player> players;
    private Board board;
    private int numberOfAttempts;
    private ArrayList<Attempt> attempts;
    private Attempt currentAttempt;
    private int emptySlots;

    public Game(int numberOfAttempts, ArrayList<Player> players) {
        try {
            this.board = new Board();
            this.numberOfAttempts = numberOfAttempts;
            this.attempts = new ArrayList<Attempt>();
            this.players = players;
            this.emptySlots = 9;
        } catch (InvalidBoardSizeException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void initialAttempt() {
        Attempt initial = new Attempt(players, board);
        currentAttempt = initial;
    }

    public Attempt getCurrentAttempt() {
        return currentAttempt;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public ArrayList<Attempt> getAttempts() {
        return attempts;
    }
    
    public void getFinalWinner(){
        for (Attempt attempt : attempts) {
            System.out.println(attempt.getPlayerWinner().getName());
        }
    }

    public Player executeValidations() {
        ValidationGame validate = new ValidationGame("game1", players, board);

        if (validate.getWinner() != null) {
            attempts.add(currentAttempt);
        }

        return validate.getWinner();
    }

    public void removeEmptySlot() {
        this.emptySlots -= 1;
    }

    public void resetEmptySlots() {
        this.emptySlots = 9;
    }

    public boolean isResetBoard() {
        if (this.emptySlots == 0) {
            board.resetBoard();
            return true;
        } else {
            return false;
        }
    }
}
