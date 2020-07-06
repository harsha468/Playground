t=int(input())
for i in range(t):
  m=input()
  n=input()
  for i in m:
    if(i in n):
      print(i*n.count(i),end='')
  print()