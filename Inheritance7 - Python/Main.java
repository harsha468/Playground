
class Cse:
  def Csal(self,s):
    print("CSE Faculty:  {}".format(s+3000))
class It:
  def Isal(self,s):
    print("IT Faculty:  {}".format(s+5000))
class Ece:
  def Esal(self,s):
    print("ECE Faculty:  {}".format(s+4500))
class Faculty(Cse,Ece,It):
  def __init__(self):
    global s
    s=int(input())
    print("Base Salary:  {}".format(s))
    super().Csal(s)
    super().Isal(s)
    super().Esal(s)    
o=Faculty()    
    