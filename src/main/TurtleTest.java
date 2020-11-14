package main;

import java.awt.Color;
import turtle.Turtle;
import turtle.World;

public class TurtleTest
{
	static World world = new World(false);
	static Turtle turtle = new Turtle(world);
	
	public static void drawingFun(int len) {
		turtle.setColor(Color.BLUE);
		turtle.forward(len);
		turtle.turn(90);
		turtle.forward(len);
	}
	
	public static void main(String[] args)
	{
		drawingFun(100);
		world.setVisible(true);
	}
	
}

