class list:
  def Exit(self):
    
    print("Exiting!")
  def Add(self,l):
    m=int(input("Enter number to append: List:  "))
    l.append(m)
    print(l)
  def Delete(self,l):
    m=int(input("Enter number to remove: List:  "))
    l.remove(m)
    print(l)
  def Display(self,l):
    print("List: ",l)

N=1
o=list()
l=[]
while N>0:
  print("0. Exit")
  print("1. Add")
  print("2. Delete")
  print("3. Display")
  n=int(input())
  #m=int(input("Enter number to append: List:  "))
  if(n==0):
    o.Exit()
    break
  elif(n==1):
    o.Add(l)
  elif(n==2):
    o.Delete(l)
  else:
    o.Display(l)    