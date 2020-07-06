class Area:
  def square(self,a):
    print("The side of square = {}".format(a))
    print("Area of square = {}".format(a*a))
  def rectangle(self,b,c):
    print("The length and breadth of rectangle = {} , {}".format(b,c))
    print("Area of rectangle = {}".format(b*c))
s=int(input())
l=int(input())
b=int(input())
a=Area()
a.square(s)
a.rectangle(l,b)