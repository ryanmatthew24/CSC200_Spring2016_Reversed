
public class Driver 
{
	public static void main(String[] args)
	{
		//test functions
		//System.out.prinln();
	}
	//integer into char 10->A
	static char intToChar(int val)
	{
		char c = (char) ('0' + val);
		"0123456789ABCEF".indexOf(c);
		return c;
	}
	
	static String decimalToBase(int decimalNumber, int radix)
	{
		//remember remainder and the division
		String recordRemainder = ("") + decimalNumber % radix;
		int recordNumber = decimalNumber / radix;
		String answer = recordRemainder;
	
		while(decimalNumber > 0);
		{
			Driver.intToChar(decimalNumber);
			decimalNumber%=radix;
			recordRemainder += decimalNumber%=radix;
			decimalNumber/=radix;
			recordNumber/=radix;
		}
        return answer;
	}
