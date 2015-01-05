import java.io.*;
import java.util.*;
class download
{
	public static void main(String ar[]) throws Exception
	{
		DataInputStream st = new DataInputStream(System.in);
		int N = Integer.parseInt(st.readLine());
		int S[]=new int[N];
		int E[]=new int[N];
		int F[]=new int[N];
		int a,k,b,t,i,count=0;
		for(a=0;a<N;a++)
		{
			StringTokenizer z=new StringTokenizer(st.readLine());
			S[a]=Integer.parseInt(z.nextToken());
			E[a]=Integer.parseInt(z.nextToken());
			F[a]=0;
		}
		int Q= Integer.parseInt(st.readLine());
		int R[]=new int[Q];
		for(a=0;a<Q;a++)
		{
			StringTokenizer z=new StringTokenizer(st.readLine());
			k= Integer.parseInt(z.nextToken());
			for(b=0;b<k;b++)
			{
				t= Integer.parseInt(z.nextToken());
				for(i=0;i<N;i++)
				{
					if(t>=S[i] && t<=E[i] && F[i]==0)
					{
						F[i]=1;
						count++;
					}
				}
			}
			R[a]=count;
			count=0;
			for(b=0;b<N;b++)
			{
				F[b]=0;
			}
		}
		for(a=0;a<Q;a++)
		{
			System.out.println(R[a]);
		}
	}
}