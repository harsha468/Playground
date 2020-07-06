try:
  l=[]
  N=int(input())
  for i in range(0,N):
    x=int(input())
    l.append(x)
  s=int(input())
  e=int(input())
  if(s>len(l) or e>len(l)):
    raise Exception
  else:
    sum=0
    for i in range(s,e):
      sum=sum+l[i]
    print("Sum of numbers in the given range =",sum)  
except Exception:
  print("list index out of range")
    
       
  
  