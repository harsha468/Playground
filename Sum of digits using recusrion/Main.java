def sumdig(N):
  if N>0:
    return (N%10+sumdig(N//10))
  else:
    return 0
n=int(input())
print(sumdig(n))