import math
t = int(input())
max = 0
for x in range(0,t):
	n, k = map(int, input().split())
	a = list(map(int, input().split()))
	b = list(map(int, input().split()))
	for y in range(0,n):
		co=int(k/a[y])
		co=co*b[y]
		if co>max:
			max = co
	print(max)
	max = 0

