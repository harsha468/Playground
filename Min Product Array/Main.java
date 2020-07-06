n,k=map(int,input().split())
a=list(map(int,input().split()))
b=list(map(int,input().split()))
diff=0
res=0
for i in range(n):
  p=a[i]*b[i]
  res+=p
  if(p<0 and a[i]<0):
    t=(a[i]-2*k)*b[i]
  elif(p<0 and a[i]>0):
    t=(a[i]+2*k)*b[i]
  elif(p>0 and a[i]<0):
    t=(a[i]-2*k)*b[i]
  elif(p>0 and a[i]>0):
    t=(a[i]+2*k)*b[i]
  d=abs(p-t)
  if(d>diff):
    diff=d
print(res-diff)
  
