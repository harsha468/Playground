from itertools import *
m,n=map(int,input().split())
a=list(''.join(i) for i in permutations(str(m)) if(int(''.join(i))>n))
if(a==[]):
  print('-1')
else:
  a.sort()
  print(a[0])