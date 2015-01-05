import java.io.*;
import java.util.*;
import java.math.*;
class ATM
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader st=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer a=new StringTokenizer(st.readLine());
		int amt=Integer.parseInt(a.nextToken());
		double bal=Double.parseDouble(a.nextToken());
		if(amt>bal-0.5 || amt%5!=0 )
		{
			System.out.println(String.format( "%.2f", bal));
			//new BigDecimal(bal-amt-0.50).setScale(2, RoundingMode.DOWN)
		}
		else
		{
			System.out.println(String.format( "%.2f", (bal-amt-0.50)));
		}
	}
}