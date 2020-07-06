class person:
  def __init__(self):
    pass
  def display(self,sname):
    print("Name of Person =",sname)
class staff(person):
  def __init__(self):
    pass
  def display(self,sid):
    print("Staff Id is  =",sid)
class temporarystaff(staff):
  def __init__(self):
    pass
  def salary(self,hrs):
    print("Total Salary =", (days)*(hrs)*150)
  def display(self,days,hrs):
    print("No. of Days =",days)
    print("No. of Hours Worked =",hrs)
sname=input()
sid=int(input())
days=int(input())
hrs=int(input())

person().display(sname)
staff().display(sid)
ob=temporarystaff()
ob.display(days,hrs)
ob.salary(hrs)
