class NoFuel(Exception):
  def __init__(self):
    pass

try:
  F=input()
  if(F.lower()=="null"):
    raise NoFuel
  else:
    print("Petrol Quantity =  {}".format(F))
    
except NoFuel:
  print("There is no fuel in the Bike")