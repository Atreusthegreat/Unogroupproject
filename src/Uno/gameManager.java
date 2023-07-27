package Uno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class gameManager {

	static Scanner scnr = new Scanner(System.in);

	private static int playerCount;
	private static ArrayList<player> players = new ArrayList<>();
	private static player currentPlayer;
	private static boolean currentturn;
	private static player selectedPlayer;
	private static boolean winner;
	
	
	//if current player has less then one card
	private boolean oneCardCheck() {
		return false;
	}
	
	//checks for empty hand of any player 
	private boolean checkForWinner() {
		return false;
	}
	
	//gets next player 
	public void nextTurn() {
 
	}
	
	//gets the players hand 
	public void getHand() {
		currentPlayer.getdeck();
	}
	
	
	//gets the card form player??
	public void getCard() {
		currentPlayer.getCard();
	}
	
	
	//gets the card info from player or card??
	public void getCardInfo() {
		
	}
	
	//plays card player places??
	public void discard() {
		
	}
	
	//skips next players turn if skipped
	public void skip() {

	}
	
	//reverse derections of players 
	public void reverse() {
		Collections.reverse(players);
	}
	
	//for wild cards to change to players wanted color
	public void colorChange() {
		
	}
	
	public void saveGame() {
		
	}
	
	public void loadGame() {
		
	}
	
	public void  newGame() {
		
	}
	
	
	public static void main(String[] args) {

		Deck deck = new Deck();
		deck.shuffleDeck();
		
		do {
			System.out.println("Enter the number of players (2-4): ");
			playerCount = scnr.nextInt();
		} while(playerCount < 2 || playerCount > 4);
		
		System.out.println("Number of players: " + playerCount);
		
		for (int i = 1; i <= playerCount; i++) {
	        System.out.println("Enter name for Player " + i + ": ");
	        String name = scnr.next();
	        player p = new player(name, new ArrayList<>());

	        // Give each player 7 cards from the deck
	        for (int j = 0; j < 7; j++) {
	            card drawnCard = deck.drawCard();
	            if (drawnCard != null) {
	                p.getPlayerHand().add(drawnCard);
	            } else {
	                System.out.println("The deck is empty. No more cards to deal.");
	                break;
	            }
	        }

	        players.add(p);
	    }
		
		for (player p : players) {
			System.out.println("Player Name: " + p.getName());
		}
		
		
	}
}
