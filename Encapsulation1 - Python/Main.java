class Customer:
  def __init__(self,n,l):
    self.__acno=n
    self.__l=l
  def __processAccount(self):
    c=0
    for i in self.__l:
      if i==self.__acno:
        print("Processing Account")
        c+=1
    if(c==0):
      print("Account Not Found")
  def getAccountNumber(self,n,l):
    print("Customer Account Number : {}".format(n))
    Customer(n,l).__processAccount()
    
    
N=int(input())
l=[]
while 1:
  x=int(input())
  if(x==-1):
    break
  l.append(x)  
o=Customer(N,l)
o.getAccountNumber(N,l)