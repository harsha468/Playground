n=int(input())
if(n<=1):
    print("You cannot generate christmas tree")
elif(n>20):
    print("Tree is no more")
else:
    for i in range(n,1,-1):
        if(i==n):
            for j in range(1,i*2+2,2):
                print(' '*(n-j//2),'*'*j,sep='')
        else:
            for j in range(3,i*2+2,2):
                print(' '*(n-j//2),'*'*j,sep='')
    print(' '*n,'*',sep='')
    print(' '*n,'*',sep='')
