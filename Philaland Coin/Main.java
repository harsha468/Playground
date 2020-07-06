t=int(input())
l=[]
for i in range(t):
  n=str(bin(int(input())))
  l.append(len(n[2:]))
for i in l:
  print(i)
  