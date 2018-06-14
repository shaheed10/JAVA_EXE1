import java.util.Scanner;

public class Numguess {

	public static void main(String[] args) {
		System.out.println("Enter the number to be guessed (0-100):");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int guess,count=0;
		if(num>100||num<0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			do {
				System.out.println("Enter your guess:");
				guess=sc.nextInt();
				if(guess>num)
					System.out.println("The number is smaller than your guess");
				else if(guess<num)
					System.out.println("The number is greater than your guess");
				else
					System.out.println("Yay! You got it");
				count++;
			}while(count<=10&&guess!=num);
			sc.close();
			if(count>10)
			{
				System.out.println("Sorry, better luck next time...");
			}
		}
		
	}

}