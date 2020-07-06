class Subset:
    def fun1(self, s1):
        return self.fun2([], sorted(s1))
    def fun2(self, sub , s1):
        if s1:
            return self.fun2(sub, s1[1:]) + self.fun2(sub + [s1[0]], s1[1:])
        return [sub]
a = []
n = int(input())
ob=Subset()
for i in range(0, n):
    b = int(input())
    a.append(b)
print("Subsets: ")
print(ob.fun1(a))
