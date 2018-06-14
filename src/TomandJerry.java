import java.util.Scanner;
public class TomandJerry {

	public static void main(String[] args) {
		int n;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a number:");
		n=input.nextInt();
		if(n%2!=0) {
			System.out.println("Tom");
		}else if(n%2==0) {
			System.out.println("Jerry");
		}
		else {
			System.out.println("Niether");
		}
		input.close();

	}

}
