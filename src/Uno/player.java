package Uno;

import java.util.ArrayList;
import java.util.List;

public class player {

	
	private String Name;
	private ArrayList<card> playerHand;
	
	public player(String name, List<card> playerHand) {
		Name = name;
		this.playerHand = (ArrayList<card>) playerHand;
	}
	
	
	
	public String getName() {
		return Name;
	}

	


	public void setName(String name) {
		Name = name;
	}



	public void setPlayerHand(ArrayList<card> playerHand) {
		this.playerHand = playerHand;
	}



	public List<card> getPlayerHand(){
		return playerHand;
	}

	public void getdeck() {
		// TODO Auto-generated method stub
		
	}

	public void getCard() {
		// TODO Auto-generated method stub
		
	}
}
