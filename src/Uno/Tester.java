package Uno;

import java.io.*;
import java.util.EnumSet;
import java.util.Scanner;

import java.util.ArrayList;

public class Tester implements Serializable {
	
	int numberPlaying;
	static ArrayList<String> names;
	static ArrayList<Player> playersPlaying = new ArrayList<>(5);
	
	//NOTE this is what I understand so far:
	//-static variables cannot be serialized
	//-GameManager cannot have variables-- it serializes each of the other classes
	
	//CHANGES
	//-all other classes now implement Serializable
	//-DeserializeTester class was added, but that is just for testing--
	//	it's functionality should be added to the GameManager class
	
	
	public static void main(String[] args) {
		
		Player player = new Player();
		
		names = new ArrayList<>();
		names.add("Mao Zedong");
//		names.add("Mahatma Gandhi");
//		names.add("Fidel Castro");
//		names.add("Adolf Hitler");
//		names.add("Benito Mussolini");
//		names.add("Joseph Stalin");
		
//		Player player1 = new Player(names.get(0));
		
		Scanner input = new Scanner(System.in);
		System.out.print("How many people are playing?  ");
		int numberPlaying = input.nextInt();
		
		for (int i = 0; i < numberPlaying; i++) {
			System.out.println("\nEnter player " + i+1 + "'s name:  ");
			player = new Player(input.next());
			playersPlaying.add(player);
		}
		
		
		try ( FileOutputStream fileOut = new FileOutputStream("savedThing.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut) ) {
			
			// object tests for serialize
//			out.writeObject(playersPlaying);
			out.writeObject(player);
//			out.writeObject(playerHand);
			
			
			
			out.close();
			fileOut.close();
			
			System.out.println("Thing is saved");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException f) {
			f.printStackTrace();
		}
		
		
//		playersPlaying = new ArrayList<>();
//		for (String s : names) {
//			playersPlaying.add(new Player((String) s));
//		}
//		
//		for (Player p : playersPlaying) {
//			System.out.println(p.getPlayerName());
//		}
//		
//		Deck unoDeck = new Deck();
//		
//		for (Player p : playersPlaying) {
//			for (int i = 0; i < 7; i++) {
//				p.addCard(unoDeck.drawCard());
//			}
//		}
//
//		for (Player p : playersPlaying) {
//			System.out.println("\n" + p.getPlayerName());
//			
//			for (Card c : p.getPlayerHand()) {
//				System.out.println(c);
//			}
//		}
		
		

//		System.out.println("CREATING A CARD AND PLAYING WITH toString() AND GETTERS:");
//		Card unoCard = new ActionCard(Colors.RED, Actions.REVERSE);
//		System.out.println(unoCard);
//		System.out.println(unoCard.getColor());
//		
//		if (unoCard instanceof ActionCard) {
//			System.out.println( ((ActionCard) unoCard).getAction());
//		} else if (unoCard instanceof NumberCard) {
//			System.out.println( ((NumberCard) unoCard).getNumber());
//		}
//		
//		
//		System.out.println();
//		System.out.println();
//		
//		
//		Deck unoDeck = new Deck();
//		
////		for (Card c : unoDeck.drawPile) {
////			System.out.println(c);
////		}
////		
////		System.out.println();
////		System.out.println();
////		
////		
////		for (Card c : unoDeck.discardPile) {
////			System.out.println(c);
////		}
//		
//		System.out.println();
//		System.out.println("LAST PLAYED CARD: " + unoDeck.topOfDiscardPile());
//
//		
//		System.out.println();
//		System.out.println();
//		
//		
//		Player unoPlayer = new Player("Chairman Mao");
//		System.out.println("CREATING A PLAYER NAMED " + unoPlayer.getPlayerName());
//		System.out.println("HE'S SAD HE HAS NO CARDS HELD IN HAND: \n" + "\t\t" + unoPlayer.getPlayerHand());
//		unoPlayer.addCard(unoCard);
//		System.out.println("\nI GAVE HIM A CARD: \n" + "\t\t" + unoPlayer.getPlayerHand());
//		
//		
//		System.out.println();
//		System.out.println();
//		
//		
//		unoPlayer.addCard(unoDeck.drawCard());
//		System.out.println("HE NOW DREW AN ADDITIONAL CARD FROM THE DECK: \n" + "\t\t" + unoPlayer.getPlayerHand());
//		
//		
//		System.out.println();
//		System.out.println();
//		
//		System.out.println("I JUST STOLE THE CARD, " + unoPlayer.removeCard(0) + ", FROM " + unoPlayer.getPlayerName() + "'S HAND.\n");
//		System.out.println("\nSEE? IT'S NO LONGER THERE... \n" + "\t\t" + unoPlayer.getPlayerHand());
//		
//		System.out.println("...BUT IT ALSO ISN'T IN THE DISCARD PILE");
//		System.out.println();
//		System.out.println();
//		
//		
//		System.out.println("TO PROPERLY REMOVE FROM PLAYER HAND YOU HAVE TO DO THIS:");
//		unoDeck.discardCard(unoPlayer.removeCard(0));
//		System.out.println("NOW NO CARDS HELD IN HAND: \n" + "\t\t" + unoPlayer.getPlayerHand());
//		
//		System.out.println("LAST PLAYED CARD: " + unoDeck.topOfDiscardPile());
//		
//		
//		//GameManager has to deal cards to playerHand, since it holds the deck
//		// deal 7 cards to the player
//		for (int i = 0; i < 7; i++) {
//			unoPlayer.addCard(unoDeck.drawCard());
//		}
//		
//		System.out.println("\n\nPLAYER " + unoPlayer.getPlayerName() + " DEALT 7 CARDS \nCARDS HELD IN HAND: ");
//		for (Card c : unoPlayer.getPlayerHand()) {
//			System.out.println("\t\t" + c);
//		}
//		
//		
//		
////		System.out.println(deck.drawCard());
////		Collections.shuffle((List<?>) deck);
//		
//		EnumSet<Colors> mainColors, mainColors2;
//		mainColors = EnumSet.of(Colors.RED, Colors.YELLOW, Colors.GREEN, Colors.BLUE);
//		mainColors2 = EnumSet.range(Colors.RED, Colors.BLUE);
////		System.out.println(mainColors + "\n" + mainColors2);

	}
}
