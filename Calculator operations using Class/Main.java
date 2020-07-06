class Arith:
  def Exit(self):
    print("Exiting!")
  def Add(self,a,b):
    print("Result:  {}".format(a+b))
  def Sub(self,a,b):
    print("Result:  {}".format(a-b))
  def Mul(self,a,b):
    print("Result:  {}".format(a*b))
  def Div(self,a,b):
    print("Result:  {}".format(a/b))
A=int(input())
B=int(input())
N=1
o=Arith()
while N==1:
  print("0. Exit")
  print("1. Add")
  print("2. Subtraction")
  print("3. Multiplication")
  print("4. Division")
  print("Enter choice:")
  n=int(input())
  if(n==0):
    o.Exit()
    break
  elif(n==1):
    o.Add(A,B)
  elif(n==2):
    o.Sub(A,B)
  elif(n==3):
    o.Mul(A,B)
  elif(n==4):
    o.Div(A,B)