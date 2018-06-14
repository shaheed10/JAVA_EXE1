import java.util.Scanner;

public class Vowcons {

	public static void main(String[] args) {
		char letter;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the charecters:");
	String str = sc.nextLine();
	sc.close();
	for(int i=0;i<str.length();i++)
	  {
		letter=str.charAt(i);
		if(letter>='a'&&letter<='z'||letter>='A'&&letter<='Z')
		{
			switch(letter)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': System.out.println(letter+" is a vowel");
			break;
			default : System.out.println(letter+" is a consonant");
			break;
			}
		}
		else
		{
			System.out.println("Invalid");
			
		}
	  }
	}

}