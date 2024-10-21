package com.bptn.course._wk2_07_four_in_a_row_challenge;

/*The player class is concerned with describing a player and things that relate to it. It keeps track of the name of a player, 
the order of the player in relation to other players in the game, and the move the player may want to make 
(which is just as simple as the user picking which column of the board they want their token to be dropped in).
 This class could also have logic to create only valid users. E.g. the playerNumber should not be greater than 4 based on 
 the specification we've received.  */

import java.util.Scanner;

public class Player {

	    private String name;          // Player's name
	    private int playerNumber;     // Player's number (token number)
	    private static Scanner scanner = new Scanner(System.in);
	 
	 
	    // Constructor to initialize player's name and player number
	    public Player(String name, int playerNumber) {
	        this.name = name;
	        this.playerNumber = playerNumber;
	    }
	 
	    // Getter for player's name
	    public String getName() {
	        return name;
	    }
	 
	    // Getter for player's number
	    public int getPlayerNumber() {
	        return playerNumber;
	    }
	 
	    // Method to prompt the player for a column number to drop their token
	    public int makeMove() {
	        System.out.print("Make your move, " + name + ". Which column do you want to put a token in? ");
	        int column = scanner.nextInt();
	        return column;
	    }
	    // String representation of the player
	    public String toString() {
	        return "Player " + playerNumber + " is " + name;
	    }
	

	}


