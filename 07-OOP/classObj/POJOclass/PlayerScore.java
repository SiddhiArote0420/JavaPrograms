/*4. Player High Score
Task:
 Create a Player class with fields: name and score.
 In the main method:
Create two individual Player objects.
Compare their scores and print the name of the player with the higher score.
Explanation:
 This helps to understand comparing fields between objects.
*/

import java.util.*;
class Player{
	private String name;
	private int score;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setScore(int score)
	{
		this.score = score;
	}
	public int getScore(){
		return score;
	}

}
public class PlayerScore{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		//data first player
		System.out.println("Enter first player Score: ");
		int score1 = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter first player name: ");
		String name1 = sc.nextLine();
		
		//first player object
		Player p1 = new Player();
		p1.setScore(score1);
		p1.setName(name1);
		
		//data 2nd player
		System.out.println("Enter Second player Score: ");
		int score2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Second player Name: ");
		String name2 = sc.nextLine();
		
		//second player object
		Player p2 = new Player();
		p2.setScore(score2);
		p2.setName(name2);
		
		if(p1.getScore() > p2.getScore())
		{
			System.out.println("Highest score player: "+ p1.getName() );
		}else if(p1.getScore() < p2.getScore()){
			System.out.println("Highest score player: "+ p2.getName() );
		}else{
			System.out.println("Both are same score" );
		}
	}
}
		