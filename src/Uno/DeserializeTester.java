package Uno;

import java.io.*;
import java.util.ArrayList;

public class DeserializeTester implements Serializable {

	int numberPlaying;
	static ArrayList<String> names;
	static ArrayList<Player> playersPlaying;
	
	public static void main(String[] args) {
		
		Player player = null;
		
		try ( FileInputStream fileIn = new FileInputStream("savedThing.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn) ) {
	
			
			// object tests for deserialize
//			playersPlaying = (ArrayList) in.readObject();
			player = (Player) in.readObject();
//			playerHand = (ArrayList) in.readObject(playerHand);
			
			
			in.close();
			fileIn.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException f) {
			f.printStackTrace();
		} catch (ClassNotFoundException g) {
			g.printStackTrace();
		}
		
		
		// outputs for each of the objects tested above
//		System.out.println(playersPlaying);
		System.out.println(player.getPlayerName() + " loves to play Uno!");
		

	} // end of main()
	

} // end of DeserializeTester
