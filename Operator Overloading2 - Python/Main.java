'''from math import*
m=int(input())
n=int(input())
class radius:
  def __init__(self,m):
    self.m=m
    print(self.m)
  def __add__(self,other):
    return self.m+other.m
  def area(self,m,n):
    print("Area: {:.14f}".format((pi*m*m)+(pi*n*n)))
ob=radius(m)
ob1=radius(n)
print("Radius of Two Circle:",ob+ob1)
ob.area(m,n)'''
import math
class circle:
  def __init__(self,a,b):
    self.a=a
    self.b=b
    print(a)
    print(b)
  def cir(self,a,b):
    return self.a+self.b
  def area(self,a,b):
    return ((math.pi)*(a)**2)+((math.pi)*(b)**2)
a=int(input())
b=int(input())
ob=circle(a,b)
x=ob.cir(a,b)
y=ob.area(a,b)
print("Radius of Two Circle: {}".format(x))
print("Area: {}".format(y))
