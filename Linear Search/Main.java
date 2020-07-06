N=int(input())
l=[]
for i in range(N):
  x=int(input())
  l.append(x)
S=int(input())  
c=0
for i in range(N):
  if l[i]==S:
    print("{} is present at location {}".format(S,i))
    c+=1
if(c==0):
  print("Element is not found")
      
      

      
      
      
 