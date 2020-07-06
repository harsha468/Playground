'''class Name:
  def employeename(self,n):
    print("Customer name:  {}".format(n),end="\n\n")
class Details(Name):
  def employeedetails(self,n,num,b,d,w):
    print("Employee Details:",end="\n\n")
    super().employeename(n)
    print("Account number:  {}".format(num),end="\n\n")
    print("Balance:  {}".format(b),end="\n\n")
    print("Deposits:  {}".format(d),end="\n\n")
    print("Withdrawal:  {}".format(w),end="\n\n")
n=input()    
num=int(input())
b=int(input()) 
d=int(input()) 
w=int(input()) 
o=Details()
o.employeedetails(n,num,b,d,w)'''
class details:
  def __init__(self,n,ac,b,d,w):
    self.n=n
    self.ac=ac
    self.b=b
    self.d=d
    self.w=w
class employee(details):
  def display(self):
    print("Employee Details:");print("")
    print("Customer name:  {}".format(self.n));print()
    print("Account number:  {}".format(self.ac));print("")
    print("Balance:  {}".format(self.b));print("")
    print("Deposits:  {}".format(self.d));print("")
    print("Withdrawal:  {}".format(self.w))
n=input();n1=int(input());n2=input();n3=input();n4=input()
a=employee(n,n1,n2,n3,n4)
a.display()