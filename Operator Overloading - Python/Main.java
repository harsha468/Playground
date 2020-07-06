class GridPoint:
  def __init__(self,x):
    self.x=x
  def __add__(self,a):
    return self.x+a.x
  def __str__(self,c):
    pass
n1=int(input())
n2=int(input())
n3=int(input())
n4=int(input())
o=GridPoint(n1)
o1=GridPoint(n3)
o2=GridPoint(n2)
o3=GridPoint(n4)
print(o+o1,end=",")
print(o2+o3)

