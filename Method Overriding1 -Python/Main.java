class RBI:
  def Interest(self):
    pass
class SBI(RBI):
  def Interest(self,x):
    print("SBI Interest : {}".format(x))
class IndianBank(RBI):
  def Interest(self,x):
    print("IndianBank Interest : {}".format(x))    
class CanaraBank(RBI):
  def Interest(self,x):
    print("Canara Bank Interest : {}".format(x))  
n1=float(input())    
n2=float(input())
n3=float(input())
o=SBI()
o1=IndianBank()
o2=CanaraBank()
o.Interest(n1)
o1.Interest(n2)
o2.Interest(n3)