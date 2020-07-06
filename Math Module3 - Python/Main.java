class arith:
  def fact(self,a):
    s=1
    for i in range(1,a+1):
      s=s*i
    print(s)
  def mod(self,b,c):
    d=c
    for i in range(2,10000):
      if(b>c):
        c=d*i
        e=c-d
      else:
        print(b-e)
        break
M=int(input())
N=int(input())
O=int(input())
ob=arith()
ob.fact(M)
ob.mod(N,O)