class Compute:
  def arith(self,a=0,b=0,c=0):
    if(c==0):
      print("Modulus = {}".format(a%b))
    else:
      print("Power = {}".format(a**(b*c)))
N=int(input())   
N1=int(input()) 
N2=int(input()) 
o=Compute()
o.arith(N,N1)
o.arith(N,N1,N2)