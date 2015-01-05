import java.io.*;
import java.util.*;
import java.math.*;
class GCDQ
{
	public static void main(String ar[]) throws Exception
	{
		// DataInputStream st=new DataInputStream(System.in);
		BufferedReader st= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(st.readLine());
		int a,n,q,b,c,l,r,gcd,n2,p=0;
		for(a=0;a<t;a++)
		{
			StringTokenizer z=new StringTokenizer(st.readLine());
			n=Integer.parseInt(z.nextToken());
			q=Integer.parseInt(z.nextToken());
			int A[]=new int[n];
			StringTokenizer k=new StringTokenizer(st.readLine());
			for(b=0;b<n;b++)
			{
				A[b]=Integer.parseInt(k.nextToken());
			}
			for(c=0;c<q;c++)
			{
				StringTokenizer d=new StringTokenizer(st.readLine());
				l=Integer.parseInt(d.nextToken());
				r=Integer.parseInt(d.nextToken());
				n2=n-(r-l)-1;
				l--;
				r--;
				int B[]=new int[n2];
				for(b=0;b<n;b++)
				{
					if(b==l)
					{
						b=r+1;
					}
					if(b!=n)
					{
						B[p]=A[b];
						p++;	
					}
				}
				p=0;
				// Arrays.sort(B);
				gcd=B[n2-1];
				for(b=n2-2;b>=0;b--)
				{
					gcd=gcdno(gcd, B[b]);
				}
				System.out.println(gcd);
			}
		}
	}
	static int gcdno(int a, int b)
	{
    	BigInteger b1 = new BigInteger(""+a);
    	BigInteger b2 = new BigInteger(""+b);
    	BigInteger g = b1.gcd(b2);
    	return g.intValue();
	}	
} 