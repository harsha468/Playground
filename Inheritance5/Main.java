class Item:
  def price(self,P):
    pass
class Customer(Item):
  def Product(self,PN):
    pass
class Bill(Customer):
  def TotalAmount(self,P,PQ):
    print("Total Price is: {}".format(P*PQ))
N=input()
P=int(input())
Q=int(input())
o=Bill()
o.Product(N)
o.price(P)
o.TotalAmount(P,Q)