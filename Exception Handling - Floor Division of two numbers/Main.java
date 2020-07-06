try:
  N=int(input())
  M=int(input())
  if(M==0):
    raise ZeroDivisionError
  else:
    print("{} // {}  =  {}".format(N,M,N//M))
except ZeroDivisionError:
  print("You cannot divide a number by zero")