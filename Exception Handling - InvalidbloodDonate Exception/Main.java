class InvalidBloodDonate(Exception):
  def __init__(self):
    pass

try:
  A=int(input())
  W=int(input())
  if(A>18 and W>55):
    print("Can donate blood")
  else:  
    raise InvalidBloodDonate
      
except InvalidBloodDonate:
  print("Not eligible to donate blood")