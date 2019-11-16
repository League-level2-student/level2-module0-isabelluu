//package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {

	//2. create an array of 5 robots.
	Robot[] rob;
	rob = new Robot[5];
	//3. use a for loop to initialize the robots.
	Robot.setWindowSize(500, 500);

	for(int a = 0; a<5; a++)
	{
		//4. make each robot start at the bottom of the screen, side by side, facing up
		rob[a].setY(100);
		rob[a].setX(400 + 5*a);
		rob[a].show();
		
	}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	Random num = new Random();
	for(int x = 0; x<5; x++)
	{
		int number = num.nextInt(50);
		rob[x].setY(number);
	}

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	int y = rob[0].getY();
	int x = rob[0].getX();
		while(y<0 && x <0)
	{
	for(int x1 = 0; x1<5; x1++)
	{
		int number = num.nextInt(50);
		rob[x1].setY(number);
	}
	}
	
	
	//7. declare that robot the winner and throw it a party!
	JOptionPane.showMessageDialog(null, "You won!");
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
