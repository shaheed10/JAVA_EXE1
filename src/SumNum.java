import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		int[] num=new int[20];
		int n,sum=0;
		System.out.println("Enter the number of inputs:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the inputs:");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
			sum+=num[i];
			
		}
		sc.close();
		System.out.println(sum);
	}

}