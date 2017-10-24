

public class DelimiterChecker
{
	
	public boolean check(String phrase)
	{
		StackX delimStack = new StackX(phrase.length());
		
		for (int i = 0; i < phrase.length(); i++)
		{
			if ((phrase.charAt(i) == ')' || phrase.charAt(i) == ']' || phrase.charAt(i) == '}') && delimStack.isEmpty()) // check for ending delims without any opening delims
				return false;
				
			// check the parentheses for matching
			else if (phrase.charAt(i) == '(')
				delimStack.push('(');
			else if (phrase.charAt(i) == ')' && delimStack.peek() == '(')
				delimStack.pop();
			else if (phrase.charAt(i) == ')' && delimStack.peek() != '(')
				return false;
			
			// check the braces for matching
			else if (phrase.charAt(i) == '{')
				delimStack.push('{');
			else if (phrase.charAt(i) == '}' && delimStack.peek() == '{')
				delimStack.pop();
			else if (phrase.charAt(i) == '}' && delimStack.peek() != '{')
				return false;
			
			// check the brackets for matching
			else if (phrase.charAt(i) == '[')
				delimStack.push('[');
			else if (phrase.charAt(i) == ']' && delimStack.peek() == '[')
				delimStack.pop();
			else if (phrase.charAt(i) == ']' && delimStack.peek() != '[')
				return false;
		}
		
		// stack should be empty after the iteration, if not return false
		if(delimStack.isEmpty())
			return true;
		else
			return false;
	}
}