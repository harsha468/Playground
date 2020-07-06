class zeroerror(Exception):
  def __init__(self):
    pass
class Negerror(Exception):
  def __init__(self):
    pass

try:
  N=int(input())
  M=int(input())
  if(N>=0 and M>=0):
    if(N==0 and M==0):
      raise zeroerror
    print(N**M)
  else:
    raise Negerror
except zeroerror:
  print("n and p should not be zero.")
except Negerror:
  print("n or p should not be negative.")