N=int(input())
l=[]
for i in range(N):
  x=int(input())
  l.append(x)
S=int(input())
#l.sort()
fir=0
las=N-1
c=0
while (fir<=las ): 
  mid=(fir+las)//2
  if S==l[mid]:
    print("{} found at location {}.".format(S,mid+1))
    c+=1
    break
  elif(S>l[mid]):
    fir=mid+1
  else:
    las=mid-1
if(c==0):
  print("Not found")