s,r=map(int,input().split())
sam=list(map(int,input().split()))
c=0
f=[]
for i in range(r):
  l,u=map(int,input().split())
  for j in range(s):
    if sam[j]>=l and sam[j]<=u:
      c+=1
  f.append(c)
  c=0
for i in range(len(f)):
  print(f[i],end=" ")
      