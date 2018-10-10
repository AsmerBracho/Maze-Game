import processing.core.PApplet; 

public class Player {
	// Instances Variables 
	int xPos; 
	int yPos; 
	int speed;
	int height;
	int width;
	int color;
	PApplet parent; // To access our processing utilities 

	public Player(PApplet p) {
		parent = p;
		height = 10;
		width = 10; 
		xPos = 0 + 2*width; 
		yPos = 0 + 2*height;
		color = parent.color(255,0,0); 
		speed = 1; 
	} // End of player 
	

	public void createNewPlayer() {
		parent.fill(color);
		parent.rectMode(parent.CENTER);
		parent.rect(xPos,yPos, width, height); 	
	} // End of createNewPlayer
	
	
	
	
	
} // End of public class Player 
