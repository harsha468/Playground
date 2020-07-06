from itertools import *
n,m=input().split()
t=[''.join(i) for i in permutations(list(n)) if(int(''.join(i))%int(m))==0]
if(t==[]):
  print('-1')
else:
  t.sort()
  print(t[0])