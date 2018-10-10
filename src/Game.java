import processing.core.PApplet; 
import processing.core.PImage; 


public class Game {
	PApplet parent; 
	PImage maze;
	boolean allowOrNot[][]; 
	int pixel;
	int black; 
	int white;
	
	// Constructor
	public Game(PApplet p) {
		parent = p;
		white = parent.color(255); 
		black = parent.color(0);
		allowOrNot = new boolean[500][500];
	} // End of constructor Game 
	
	// Methods 
	public void setImageGame() {
		maze = parent.loadImage("maze1.gif"); 
	} // End of setImageGame

	
	public void setValuesPermited() {
		// Let's access to our array and give value to it
		for (int i = 0; i <= 500 ; i++) { // Rows 
			for (int j = 0; j <= 500 ; j++) { // Columns
				pixel = maze.parent.get(i, j);
				if (pixel == black) {
					allowOrNot[i][j] = false; // Can not go there
				} else if (pixel == white) {
					allowOrNot[i][j] = true; // it is good to go 
				}
			} // End of columns
		} // End of Rows
		
	} // End of setValuesPermited 
} // End of public class Game 

