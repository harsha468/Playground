class NormalRoom:
  def Calculates(self,r,d):
    if(d==1):
      rent=300*r*d
    elif(d>1 and d<=5):
      rent=250*r*d
    else:
      rent=200*r*d
    print("Room Rent = {}".format(rent))
class AcRoom:
  def AcCalculates(self,r,d):
    if(d==1):
      rent=450*r*d
    elif(d>1 and d<=5):
      rent=300*r*d
    else:
      rent=250*r*d
    print("Room Rent = {}".format(rent))
class SuiteRoom:
  def SuiteCalculate(self,r,d):
    if(d==1):
      rent=550*r*d
    elif(d>1 and d<=5):
      rent=500*r*d
    else:
      rent=450*r*d
    print("Room Rent = {}".format(rent))
class Hotal(NormalRoom,AcRoom,SuiteRoom):
  def Display(self,N,A,M,R,D,I):
    print("Name: {}".format(N))
    print("Address: {}".format(A))
    print("Mobile: {}".format(M))
    if I==1:
      super().Calculates(R,D)
    elif I==2:
      super().AcCalculates(R,D)
    elif I==3:
      super().SuiteCalculate(R,D)
      

N=input()
A=input()
M=input()
R=int(input())
D=int(input())
I=int(input())
H=Hotal()
H.Display(N,A,M,R,D,I)