package Uno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<card> cards;
	
	public Deck() {
		cards = new ArrayList<>();
		String[] colors = { "Red", "Green", "Blue", "Yellow" };
		String[] values = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Skip", "Reverse", "DrawTwo"};
		
		for(String color : colors) {
			for(String value : values) {
				cards.add(new card(color, value));
			}
		}
	
		cards.add(new card("Wild", "Wild"));
		cards.add(new card("Wild", "Wild draw four"));
		
	}
	
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}
	
	public card drawCard() {
		return cards.remove(0);
	}

}
