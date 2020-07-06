t=int(input())
for i in range(t):
  s=input()
  s1=s;c=0;flag=0
  for j in range(len(s)):
    if(s[::-1]==s or s1[::-1]==s1):
      flag=1
      break
    s=s[1:]+s[0]
    s1=s1[-1]+s1[:len(s1)-1]
    c+=1
  if(flag==1):
      print(c)
  else:
      print(-1)