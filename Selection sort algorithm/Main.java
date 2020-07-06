N=int(input())
l=[]
for i in range(N):
  x=int(input())
  l.append(x)
for i in range(N):
  for j in range(1,N):
    if(l[j-1]>l[j]):
      temp=l[j-1]
      l[j-1]=l[j]
      l[j]=temp
for i in l:
  print(i,end=' ')