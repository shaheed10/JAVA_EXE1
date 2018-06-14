import java.util.Scanner;
public class Capital_letter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:" );
		char c = sc.next().charAt(0);
		
		
		if(c>='A' && c<='Z') {
			System.out.println("Capital Letter");
			
		}else if(c>='a' && c<='z') {
			System.out.println("Smaller Letter");
			
		}else if(c>=0 && c<=9){
			System.out.println("Number");
		}else {
			System.out.println("Symbol");
		}
		sc.close();
		

	}

}
