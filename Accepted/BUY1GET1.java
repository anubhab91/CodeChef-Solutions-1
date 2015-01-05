import java.io.*;
import java.util.*;
class buy
{
	public static void main(String ar[]) throws Exception
	{
		DataInputStream st=new DataInputStream(System.in);
		int t=Integer.parseInt(st.readLine());
		int a,b,f=0,co=0;
		String k,y="";
		for(a=0;a<t;a++)
		{
			k=st.readLine();
			while(k.length()!=0)
			{
				for(b=0;b<k.length();b++)
				{
					if(k.charAt(0)==k.charAt(b))
					{
						f++;
					}
					else
					{
						y=y+k.charAt(b);
					}
				}
				co=co+(f/2);
				if(f%2==1)
				{
					co=co+1;
				}
				f=0;
				k=y;
				y="";
			}
			System.out.println(co);
			co=0;
		}
	}
}