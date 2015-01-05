import java.io.*;
import java.util.*;
class download
{
	public static void main(String ar[]) throws Exception
	{
		Scanner st = new Scanner(System.in);
		int N = st.nextInt();
		int S[]=new int[N];
		int E[]=new int[N];
		int F[]=new int[N];
		int a,k,b,t,i,count=0;
		for(a=0;a<N;a++)
		{
			S[a]=st.nextInt();
			E[a]=st.nextInt();
			F[a]=0;
		}
		int Q= st.nextInt();
		int R[]=new int[Q];
		for(a=0;a<Q;a++)
		{
			k= st.nextInt();
			for(b=0;b<k;b++)
			{
				t= st.nextInt();
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