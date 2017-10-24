public class demoStack
{
	public static void main (String[] args)
	{
		DelimiterChecker delimCheck = new DelimiterChecker();
		
		if(delimCheck.check(")"))
			System.out.println("Delimiters work");
		else
			System.out.println("Mismatch error");
	}
}