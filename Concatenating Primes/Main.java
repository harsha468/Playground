from itertools import *
def isprime(n):
  for i in range(2,n):
    if(n%i==0):
      return 0
  return 1
n=int(input())
l=[]
c=0
for i in range(2,n+1):
	if(isprime(i)):
  		l.append(str(i))
l1=list(product(l,repeat=2))
for j in l1:
  if(isprime(int(("".join(j))))):
    c+=1
print(c)