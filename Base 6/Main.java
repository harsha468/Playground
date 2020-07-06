def basesix(N):
  s=0
  while(N!=0):
    s+=N%6
    N=N//6
  return s

N=int(input())
l=list(map(int,input().split()))
l=[basesix(i) for i in l]
c=0
for i in range(N):
  for j in range(i+1,N):
    if(l[i]>l[j]):
      c+=1
print(c)