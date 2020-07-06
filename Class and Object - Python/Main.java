class Mobile:
  def display(self,a,b,c,d):
    print("{} own {} {} color smartphone having {} MP camera".format(a,b,c,d))

    
N=input()
B=input()
C=input()
P=int(input())
ob=Mobile()
ob.display(N,B,C,P)