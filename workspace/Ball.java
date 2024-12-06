//Class Author: Buket Guner
//Date created: 12/4/24
//General Description: This class creates the information needed about the ball in the game of BrickBreak.

import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	
	private int Ypos;
	private int Xpos;
	private int size;
	private int Xvelocity;
	private int Yvelocity;

	
	//constructor(s):

		public Ball(int initSize, int initXpos, int initYpos) {
			size = initSize;
			Xpos = initXpos;
			Ypos = initYpos;
			Xvelocity = 2;
			Yvelocity = 3;

		}

	
	//methods:

	public int getXpos() {
		return Xpos;
	}

	public int getYpos() {
		return Ypos;
	}

	public int getSize() {
		return size;
	}

	//precondition: newXvelocity needs to have a value, so that the Xvelocity now becomes that
	//postconditon: the Xvelocity will now have a new value!

	public void setXVelocity(int newXvelocity) {
		Xvelocity = newXvelocity;
	}

	////precondition: newYvelocity needs to have a value, so that the Yvelocity now becomes that
	//postconditon: the Yvelocity will now have a new value!

	public void setYVelocity(int newYvelocity) {
		Yvelocity = newYvelocity;
	}

	public void setX(int newXpos) {
		Xpos = newXpos;
	}

	public void setY(int newYpos) {
		Ypos = newYpos;
	}

	//precondition: Xvelocity needs to have a prior value
	//postcondition: the new value of Xvelocity will now be in the reverse direction of the prior one
	//for example, Xvelocity of 5 will now have an Xvelocity of -5

	public void reverseX() {
		Xvelocity = -1 * (Xvelocity);
	}

	//precondition: Yvelocity needs to have a prior value
	//postcondition: the new value of Yvelocity will now be in the reverse direction of the prior one
	//for example, Yvelocity of 10 will now have an Yvelocity of -10

	public void reverseY() {
		Yvelocity = -1 * (Yvelocity);
	}

	//precondition: Xpos, Ypos, and size-which includes width and height-need to have values
	//postcondition: a ball will now be created

	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(Xpos, Ypos, size, size);
	}

	//precondition: Xvelocity, Xpos, Yvelocity, and Ypos need to have prior values
	//postcondition: the ball will now be able to move!

	public void move() {
		Xpos = Xvelocity + Xpos;
		Ypos = Yvelocity + Ypos;
	}



}
