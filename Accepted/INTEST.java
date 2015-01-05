import java.io.*;
import java.util.*;
class intest
{
	public static void main(String ar[]) throws Exception
	{
		DataInputStream b=new DataInputStream(System.in);
		StringTokenizer st=new StringTokenizer(b.readLine());
		int n,k,co=0;
		n=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		for(int a=0;a<n;a++)
		{
			if(Integer.parseInt(b.readLine())%k==0)
			{
				co++;
			}
		}
		System.out.println(co);
	}
}