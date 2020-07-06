n=int(input())
a=[]
for i in range(n):
  m=int(input())
  a.append(m)
for i in range(n-1):
  for j in range(n-i-1):
    if(a[j]>a[j+1]):
      t=a[j]
      a[j]=a[j+1]
      a[j+1]=t
for i in range(n):
  print(a[i],end=" ")
