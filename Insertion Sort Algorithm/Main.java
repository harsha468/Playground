def insertion(l):
  for i in range(1,len(l)):
    t=l[i]
    j=i-1
    while(j>=0 and t<l[j]):
      l[j+1]=l[j]
      j=j-1
    l[j+1]=t
l=[]
n=int(input())
for i in range(1,n+1):
  x=int(input())
  l.append(x)
insertion(l)
for i in l:
  print(i)