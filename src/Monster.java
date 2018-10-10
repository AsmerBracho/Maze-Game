import processing.core.PApplet; 

public class Monster {
	int x; 
	int y; 
	int speed; 
	int height; 
	int width; 
	int color;
	PApplet parent;
	
	
	public Monster(PApplet p, int color) {
		parent = p; 
		height = 10; 
		width = 10;
		x = 500 - 2*width;
		y = 500 - 2*height; 
		speed = 1; 
		this.color = color;
	} // End of Monster 


	public void createMonster() {
		parent.fill(color);
		parent.ellipseMode(parent.CENTER);
		parent.ellipse(x, y, width, height);
	} // End of createMonster
	
	

}
