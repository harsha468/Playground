class Parent:
  def __init__(self,N,M):
    print(N,M,sep="\n")
class Child:
  def __init__(self,N,M):
    Parent(N,M)
N=input()
M=int(input())
o=Child(N,M)
