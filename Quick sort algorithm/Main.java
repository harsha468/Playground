class Node:
  def __init__(self,x):
    self.data=x
    self.next=None
    self.prev=None
  def insert(self,x):
    if x<self.data:
      if self.prev is None:
        self.prev=Node(x)
      else:
        self.prev.insert(x)
    else:
      if(self.next is None):
        self.next=Node(x)
      else:
        self.next.insert(x)
  '''def postorderprint(self):
    if self.prev:
      self.prev.postorderprint()
    if self.next:
      self.next.postorderprint() 
    print(self.data)'''
  def inorderprint(self):
    if self.prev:
      self.prev.inorderprint()
    print(self.data,end=' ')
    if self.next:
      self.next.inorderprint()
N=int(input())
n=int(input())
root=Node(n)
for i in range(1,N):
  n=int(input())
  root.insert(n)
root.inorderprint()