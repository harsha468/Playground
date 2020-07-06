class SimpleInterest:
  def show(self,N,Y,I):
    print("Principle amount: {}".format(N))
    print("No.Of.Years: {}".format(Y))
    print("Rate of interest: {}".format(I))
class Interest(SimpleInterest):
  def Display(self,N,Y,I):
    super().show(N,Y,I)
    print("Simple Interest: {}".format((N*Y*I)/100))
P=int(input())  
Y=int(input())    
R=int(input())
o=Interest()
o.Display(P,Y,R)