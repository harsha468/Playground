n=int(input())
s=6
t=22
for i in range(n-1,-1,-1):
  print(' '*5*i,end='')
  for j in range(n-i):
    a='0'*(5-len(str(s)))+str(s)
    print(a,end='     ')
    s=s+t
    t+=16
  print()