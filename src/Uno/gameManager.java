package Uno;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class gameManager {

	static Scanner scnr = new Scanner(System.in);

	private static int playerCount;
	private static ArrayList<Player> players = new ArrayList<>();
	private static Player currentPlayer;
	private static boolean currentturn;
	private static Player selectedPlayer;
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
		if (currentturn) {
			currentPlayer = players.get((players.indexOf(currentPlayer) + 1) % players.size());
			currentturn = false;
		}else {
			currentturn = true;
		}
 
	}
	
	//gets the players hand 
	public void getHand() {
		currentPlayer.getPlayerHand();
	}
	
	
	//gets the card info from player or card??
	public void getCardInfo() {
		
	}
	
	//plays card player places??
	public void discard() {
		
	}
	
	//skips next players turn if skipped
	public void skip() {

		if (currentPlayer.getCard().getAction() == Actions.SKIP) {
			currentPlayer = players.get((players.indexOf(currentPlayer) + players.size() + 2) % players.size());
		}
	}
	
	//reverse derections of players 
	public void reverse() {
		Collections.reverse(players);
	}
	
	//for wild cards to change to players wanted color
	public void colorChange() {
		
	}
	
	public void saveGame() {
		
		
		Tester tester = new Tester();

		try ( FileOutputStream fileOut = new FileOutputStream("savedGame.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			
			out.writeObject(tester);
			out.close();
			fileOut.close();
			
			System.out.println("Game is saved");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException f) {
			f.printStackTrace();
		}
		
	}
	
	public void loadGame() {
		
	}
	
	public void  newGame() {
		
	}
	
	
	public static void main(String[] args) {

		Deck deck = new Deck();
		
		do {
			System.out.println("Enter the number of players (2-4): ");
			playerCount = scnr.nextInt();
		} while(playerCount < 2 || playerCount > 4);
		
		System.out.println("Number of players: " + playerCount);
		
		for (int i = 1; i <= playerCount; i++) {
	        System.out.println("Enter name for Player " + i + ": ");
	        String name = scnr.next();
	        Player p = new Player(name);

	        // Give each player 7 cards from the deck
	        for (int j = 0; j < 7; j++) {
	            Card drawnCard = deck.drawCard();
	            if (drawnCard != null) {
	                p.getPlayerHand().add(drawnCard);
	            } else {
	                System.out.println("The deck is empty. No more cards to deal.");
	                break;
	            }
	        }

	        players.add(p);
	    }
		
		for (Player p : players) {
			System.out.println("Player Name: " + p.getPlayerName());
			System.out.println("Player Hand: ");
			for(Card card: p.getPlayerHand()) {
				System.out.println(card + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
