import java.util.Scanner;
class Game
{
	public static void main(String args[])
	{
		Umpire u=new Umpire();
		u.collectNumGusser();
		u.collectNumFromPlayers();
		u.compare();
	}
}
class Gusser
{
	int gnum;
	int  guessNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Gusser please a number=");
		gnum=sc.nextInt();
		return gnum;
	}
}
class Player
{
	int pnum;
	int guessNum(String playerName)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(playerName+"Player please Guess a no=");
		pnum=sc.nextInt();
		return pnum;
	}
}
class Umpire
{
	int numfromguessor;
	int numfromplayer1;
	int numfromplayer2;
	int numfromplayer3;
	void collectNumGusser()
	{
		Gusser g=new Gusser();
		numfromguessor=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p=new Player();
		numfromplayer1=p.guessNum("First");
		numfromplayer2=p.guessNum("Second");
		numfromplayer3=p.guessNum("Third");
	}
	void compare()
	{
		if(numfromguessor==numfromplayer1)
			System.out.println("player first Win");
		else if(numfromguessor==numfromplayer2)
			System.out.println("player second win");
		else if(numfromguessor==numfromplayer3)
			System.out.println("player third win");
		else
			System.out.println("game over");
	}
}
	
		