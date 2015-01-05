#include<stdio.h>
int gcdno(int a,int b)
{
	int t;
	while(b!=0)
	{
		t=b;
		b=a%b;
		a=t;
	}
	return a;
}
int main()
{
	int t;
	scanf("%d", &t);
	int a,n,q,b,c,l,r,gcd,n2,p=0;
	for(a=0;a<t;a++)
	{
		scanf("%d %d",&n,&q);
		int A[n];
		for(b=0;b<n;b++)
		{
				scanf("%d", &A[b]);
		}
		for(c=0;c<q;c++)
		{
			scanf("%d",&l);
			scanf("%d",&r);
			n2=n-(r-l)-1;
			l--;
			r--;
			int B[n2];
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
			printf("%d\n",gcd);
		}
	}
}
