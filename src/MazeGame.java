import processing.core.PApplet;
 

public class MazeGame extends PApplet {
	// Here we probable will declare some variables 
	
	Player p1;
	Game game;
	Monster m; 
	boolean[] keyboard = new boolean[128];
	
	public static void main(String[] args) {
		PApplet.main("MazeGame");	
	}
	
	public void settings() {
		size(500, 500);
	} // End of settings 
	
	public void setup(){
		// Create Game
		game = new Game(this);
		// set the image Game 
		game.setImageGame(); // define the board we are going to play in
		// Create Player 
		p1 = new Player(this); 
		// Create a Monster 
		m = new Monster(this, color(0,255,0)); 
	} // End of setup
	
	public void draw() {
		game.setValuesPermited(); // set the values for our matrix 
		background(255);
		// draw the background 
		image(game.maze,0,0);
		// draw the Player 
		p1.createNewPlayer();
		move();
		// Draw a Monster 
		m.createMonster();
		moveMonster();
	} // End of draw 
		
	public void move() {	
		if (keyboard['w'] == true) {
			if (game.allowOrNot[p1.xPos][p1.yPos - p1.height/2 - p1.speed] == true) {
			p1.yPos -= p1.speed;
			}
		} else if (keyboard['a'] == true) {
			if (game.allowOrNot[p1.xPos  - p1.width/2 - p1.speed][p1.yPos] == true) {
			p1.xPos -= p1.speed;
			}
		} else if (keyboard['d'] == true) {
			if (game.allowOrNot[p1.xPos + p1.width/2 + p1.speed][p1.yPos] == true) {
			p1.xPos += p1.speed; 
			}
		} else if (keyboard['s'] == true) {
			if (game.allowOrNot[p1.xPos][p1.yPos + p1.height/2 + p1.speed] == true) {
			p1.yPos += p1.speed; 
			}
		}   
	} // End of move
	
	
	public void keyPressed() {
		keyboard[key] = true;
	} // End of keyPressed

	public void keyReleased() {
		keyboard[key] = false;
	} // End of keyReleased

	
	
	
	//-------------------------------MOVE MONSTER-----------------------------------------
	public void moveMonster() {
		int randomNumber = 2;
		
		if (game.allowOrNot[m.x  - m.width/2 - m.speed][m.y] == false) {
			randomNumber = round(random(1,3));
		}
		
		if (randomNumber == 1) {
			if (game.allowOrNot[m.x][m.y - m.height/2 - m.speed] == true) {
				// move up
				m.y -= m.speed;
			}
		} else if (randomNumber == 2) {
			if (game.allowOrNot[m.x  - m.width/2 - m.speed][m.y] == true) {
				// move left
				m.x -= m.speed;
			}
		} else if (randomNumber == 3) {
			if (game.allowOrNot[m.x + m.width/2 + m.speed][m.y] == true) {
				// move right
				m.x += m.speed; 
			}
		} else if (randomNumber == 4) {
			if (game.allowOrNot[m.x][m.y + m.height/2 + m.speed] == true) {
				// move down 
				m.y += m.speed; 
			}
		}   
	} // End Of MoveMonster
	
	
	
} // End on public class MazeGame extend PApplet 
