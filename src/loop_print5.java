import java.util.Scanner;
public class loop_print5 {

	public static void main(String[] args) {
		int n;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the upper limit number:");
		
		n=input.nextInt();		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
			System.out.println(i);
		}

	}

}}
