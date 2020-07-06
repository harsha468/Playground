class square:
  def ispsqr(self,a):
    if((a**0.5)%1==0):
      print("Perfect Square")
    else:
      print("Not Perfect Square")
  
  
N=int(input())
ob=square()
ob.ispsqr(N)