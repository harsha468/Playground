def bin(N):
  r=N%2
  d=N//2
  print(r,end=' ')
  if(d!=0):
    bin(d)    
n=int(input()) 
bin(n)