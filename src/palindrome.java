
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int number,rev=0,dig,even=0,n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = input.nextInt();
		input.close();
		n=number;
		do {
			dig=n%10;
			rev=(rev*10)+dig;
			n=n/10;
			
		}while(n!=0);
		n=number;
		if(rev==number)
		{
			System.out.println("The number is a palindrome");
			while(n!=0)
			{
				dig=n%10;
				if(dig%2==0)
				{
					even+=dig;
				}
				n=n/10;
			}
			System.out.println("The sum of the even numbers is "+even);
			if(even>25)
				System.out.println("Sum is more than 25");
			else
				System.out.println("Sum is less than 25");
			
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}

}