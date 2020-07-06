class Rectangle:
  def area(self,l,b):
    return l*b

class square:
  def area(self,s):
    return s*s
l=int(input())    
b=int(input())    
s=int(input())    
o=Rectangle()
print("Area of Rectangle: {}".format(o.area(l,b)))
o1=square()
print("Area of Square: {}".format(o1.area(s)))