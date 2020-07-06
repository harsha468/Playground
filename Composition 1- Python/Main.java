class salary:
  def __init__(self,m):
    self.m=m
  def get_total(self):
    return self.m*12
class employee:
  def __init__(self):
    pass
  def annual_salary(self,b):
    ob=salary(M)
    print("Total:",ob.get_total()+b)

M=int(input())
B=int(input())
ob1=employee()
ob1.annual_salary(B)
    