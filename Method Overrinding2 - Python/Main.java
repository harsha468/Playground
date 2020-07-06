class Animal:
  def breathe(self):
    print("I breathe oxygen")
  def food(self):
    print("I eat food")
class Herbivores(Animal):
  def food(self,name):
    print("{} : I am a Vegetarian".format(name))
class Carnivores(Animal):
  def food(self,name):
    print("{} : I am a Non Vegetarian".format(name))
class Omnivores(Animal):
  def food(self,name):
    print("{} : I eat both".format(name))
n1=input()
n2=input()
n3=input()
o=Herbivores()
o1=Carnivores()
o2=Omnivores()
o.food(n1)
o.breathe()
o1.food(n2)
o1.breathe()
o2.food(n3)
o2.breathe()
