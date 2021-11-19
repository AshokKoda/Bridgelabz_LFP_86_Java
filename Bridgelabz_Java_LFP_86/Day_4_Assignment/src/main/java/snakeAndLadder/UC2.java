package snakeAndLadder;

import java.util.Random;

public class UC2 {

	public static void main(String[] args) {
		int position = rollDice();
		//SnakeNLadder s = new SnakeNLadder();
		System.out.println(position);

	}
	
	public static int rollDice()
	{
		int n = 0;
		Random r = new Random();
		n=r.nextInt(7);
		return (n==0?1:n);
	}

}
	
	
