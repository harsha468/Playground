class Account():
  def __init__(self,A,N,S,D,C,SC):
    self.__a=A
    self.__n=N
    self.__s=S
    self.__d=D
    self.__c=C
    self.__sc=SC
  def display(self):
    print("****Statement****")
    print("Account Number : {}".format(self.__a))
    print("Holder Name : {}".format(self.__n))
    
  def generateStatement(self,A,N,S,D,C,SC):
    if(self.__s==self.__sc):
      Account(A,N,S,D,C,SC).display()
      print("Number of Debits : {}".format(self.__d))
      print("Number of Credits : {}".format(self.__c))
    else:
      print("Invalid Login")  
A=int(input())
N=input()
S=int(input())
D=int(input())
C=int(input())
SC=int(input())
o=Account(A,N,S,D,C,SC)
o.generateStatement(A,N,S,D,C,SC)