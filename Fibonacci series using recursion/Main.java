def fib(N): 
    if N<=1: 
        return N
    else: 
        return fib(N-1)+fib(N-2)
n=int(input())
for i in range(n):
  print(fib(i))
