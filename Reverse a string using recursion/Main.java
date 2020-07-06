def reve(x):
    if(x==''):
        return ''
    else:
        return x[-1]+reve(x[:-1])
n=input()
print(reve(n))
