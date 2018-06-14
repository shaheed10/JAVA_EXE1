
public class stringrep {

	public static void main(String[] args) {
		String str="123456789hsnfukwx",repeat="";
		int n=8;
		System.out.println("The original string is: "+str);
		for(int i=str.length()-n;i<str.length();i++)
		{
			repeat=repeat+str.charAt(i);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(repeat+" ");
		}
	}

}