//Class Author: Buket Guner
//Date created: 12/4/24
//General Description: This class creates the information needed about the ball in the game of BrickBreak.

import java.awt.Graphics;
import java.awt.*;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:

	private int width;
	private int height;
	private int x;
	private int y;
	private int Xvelocity;
	private int Yvelocity;
	

	
	//constructor(s):

	public Paddle(int initWidth, int initHeight, int initX, int initY) {
		width = initWidth;
		height = initHeight;
		x = initX;
		y = initY;
		Xvelocity = 5;

	}
	

	//methods:

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getVelocity() {
		return Xvelocity;
	}

	//Precondition: Xvelocity needs to have a value
	//Postcondition: The Xvelocity will be changed, as a certain velocity will be added

	public void addVelocity(int addedVelocity) {
		Xvelocity = Xvelocity + addedVelocity;
	}

	public void setX(int newX) {
		x = newX;
	}

	public void setY(int newY) {
		y = newY;
	}

	public void setVelocity(int newVelocity) {
		Xvelocity = newVelocity;
	}

	//precondition: x, y, width, and height need to have values in order to draw the rectangle
	//postcondition: a rectange will be drawn

	public void draw(Graphics g) {
		g.fillRect(x, y, width, height); 
	}

	//precondition: Xvelocity and Yvelocity need to have velocities, in order to have to Paddle move
	//postcondition: the paddle will be able to move

	public void move() {
		x += Xvelocity;
		y += Yvelocity;
	}
	
	
}
