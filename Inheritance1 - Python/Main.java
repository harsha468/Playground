class Calculator:
  def add(self,num1,num2):
    print("Addition : {}".format(num1+num2))
  def sub(self,num1,num2):
    print("Subtraction : {}".format(num1-num2))
class AdvancedCalculator(Calculator):
  def mul(self,num1,num2):
    print("Multiplication : {}".format(num1*num2))
  def div(self,num1,num2):
    print("Floor Division : {}".format(num1//num2))
N1=int(input())
N2=int(input())
o=AdvancedCalculator()
o.add(N1,N2)
o.sub(N1,N2)
o.mul(N1,N2)
o.div(N1,N2)