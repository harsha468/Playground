n=int(input())
k=1
l=n*(n+1)
for i in range(n-1,-1,-1):
  print('*'*(n-i-1)*2,end='')
  for j in range(0,i+1):
    print(k,end='0')
    k+=1
  for j in range(i+1,0,-1):
    if(j==1):
      print(l-j+1)
    else:
      print(l-j+1,end='0')
  l=l-i-1