class passport:
  def __init__(self,a,b,c):
    self.name=a
    self.address=b
    self.number=c
  def details(self):
    print("Name :",self.name)
    print("Address :",self.address)
    print("Passport Number :",self.number)
class person:
  def __init__(self):
    N=input()
    A=input()
    Num=input()
    ob=passport(N,A,Num)
    ob.details()
ob1=person()


