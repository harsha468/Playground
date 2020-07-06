def superstring(s):
  for i in s:
    if(s.count(i)!=ord(i)-96):
      return 0
  return 1
T=int(input())
for i in range(T):
  s=input()
  if(superstring(s)):
    print("YES",end=" ")
  else:
    print("NO",end=" ")