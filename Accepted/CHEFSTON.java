import java.io.*;
import java.util.*;
class chefston
{
	public static void main(String ar[]) throws Exception
	{
		// DataInputStream st=new DataInputStream(System.in);
		BufferedReader st= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(st.readLine());
		int i,j,n,k;
		long co,max=0;
		for(i=0;i<t;i++)
		{
			StringTokenizer z=new StringTokenizer(st.readLine());
			n=Integer.parseInt(z.nextToken());
			k=Integer.parseInt(z.nextToken());
			long a[]=new long[n];
			long b[]=new long[n];
			StringTokenizer y=new StringTokenizer(st.readLine());
			StringTokenizer x=new StringTokenizer(st.readLine());
			for(j=0;j<n;j++)
			{
				a[j]=Long.parseLong(y.nextToken());
				b[j]=Long.parseLong(x.nextToken());			
				co=(k/a[j])*b[j];
				if(co>max)
				{
					max=co;
				}
			}
			System.out.println(max);
			max=0;
		}
	}
}