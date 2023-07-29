package Uno;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * Manages an Uno player and their hand
 * 
 * @author Brayden Jones
 * @author Bryson Lott
 * @author Trenton Stratton
 */
public class Player implements Serializable {
	
	public String playerName = "";
	public ArrayList<Card> playerHand;
	
	/*
	 * Class constructor
	 * 
	 * @param name		the string to be stored as player's name
	 */
	public Player(String name) {
		playerName = name;
		playerHand = new ArrayList<>(12);
	} // end of constructor
	
//	
	public Player() {
		playerHand = new ArrayList<>(12);
	} // end of constructor
//
	
	/* 
	 * Returns player's name
	 * 
	 * @return playerName		a string of the player's name
	 */
	public String getPlayerName() {
		return playerName;
	} // end of getPlayerName()

	/*
	 * Shows cards in player's hand
	 * 
	 * @return playerHand		 a card array of player's hand
	 */
	public ArrayList<Card> getPlayerHand() {
		return playerHand;
	} // end of getPlayerHand()

	/*
	 * Adds a card to player's hand
	 * 
	 * @param c		the card to be added
	 */
	public void addCard(Card c) {
		playerHand.add(c); // TODO add logic in GameManager to prevent drawing if playerHand holds the max (12 cards)
	} // end of addCard()
	
	/* 
	 * Removes a card from player's hand
	 * 
	 * @param i		the index of the card to remove
	 */
	public Card removeCard(int i) {
		return playerHand.remove(i);
	} // end of removeCard()

	public Object getCard() {
		// TODO Auto-generated method stub
		return null;
	}
	
} // end of Player