public class NumSort {

	public static void main(String[] args) {
		int num=75824,n,temp,even=0;
		int[] arr=new int[5];
		n=num;
		for(int i=0;n!=0;i++)
		{
			arr[i]=n%10;
			System.out.print(arr[i]);
			n=n/10;
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The sorted number is:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				even+=arr[i];
			System.out.print(arr[i]);
		}
		System.out.println("\nSum of Even numbers is: "+even);
		if(even>15)
			System.out.println("\nTrue");
		else
			System.out.print("\nFalse");



	}

}