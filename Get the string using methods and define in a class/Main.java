class string:
  def Accept(self):
    global n
    n=input()
  def Print(self):
    print("The method that the string accepted is:")
    print(n)    
o=string()
o.Accept()
o.Print()
    