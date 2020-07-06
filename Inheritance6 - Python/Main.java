class compound:
  def get(self,p,r,yc,yn):
    pass
class interest(compound):
  def calc(self,p,r,yc,yn):
    return (p*(1+(r/(yc*100)))**(yn*yc))
class final(interest):
  def display(self,p,r,yc,yn):
    print("Principle amount: {:.1f}".format(p))
    print("No.Of times compounded: {:.1f}".format(yc))
    print("No.Of.Years: {:.1f}".format(yn))
    print("Rate of interest: {:.1f}".format(r))
    d=interest().calc(p,r,yc,yn)
    #print(d)
    print("Amount: {}".format(d))
    print("Compound Interest is: {}".format(d-p))
p=int(input())
r=float(input())
yc=int(input())
yn=int(input())
ob=final()
ob.display(p,r,yc,yn)
