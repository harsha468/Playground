import math
class area():
  def ar(self,l,b=0):
    if(b==0):
      print("Area of Circle =",math.ceil(math.pi*l*l))
    else:
      print("Area of Rectangle =",l*b)
m=int(input())
n=int(input())
b=int(input())
l=area()
l.ar(m)
l.ar(n,b)