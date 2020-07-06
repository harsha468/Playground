#include<iostream>
#include<cstring>
using namespace std;
using namespace std;
struct Student
{
  char name[30];
  char department[20];
  int year;
  float cgpa;
};
int main()
{
  int n,i,z,j;
  float x;
  char t[100];
  char name[30];
  Student s[10];
  char ab[30];
  std::cout<<"Enter the number of students"<<'\n';
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    std::cout<<"Enter the details of student "<<i+1<<'\n';
    std::cout<<"Enter name"<<'\n'<<"Enter department"<<'\n'<<"Enter year of study"<<'\n'<<"Enter cgpa"<<'\n';
    std::cin.getline(s[i].department,20);
    std::cin.getline(s[i].name,30);
    std::cin.getline(s[i].department,20);
    std::cin>>s[i].year;
    std::cin>>s[i].cgpa;
  }
  cout<<"Details of students"<<'\n';
  for(i=1;i<n;i++)
  {
    for(j=1;j<n;j++)
    {
      if(strcmp(s[j-1].name, s[j].name)>0)
      {
        strcpy(t,s[j-1].name);
        strcpy(s[j-1].name,s[j].name);
        strcpy(s[j].name, t);
        strcpy(t,s[j-1].department);
        strcpy(s[j-1].department,s[j].department);
        strcpy(s[j].department, t);
        z=s[j].year;
        s[j].year=s[j-1].year;
        s[j-1].year=z;
        x=s[j].cgpa;
        s[j].cgpa=s[j-1].cgpa;
        s[j-1].cgpa=x;
        
      }
    }
  }
  for(i=0;i<n;i++)
  {
    std::cout<<"Student "<<i+1<<'\n';
    std::cout<<"Name:"<<s[i].name<<'\n';
  std::cout<<"Department:"<<s[i].department<<'\n';
  std::cout<<"Year of study:"<<s[i].year<<'\n';
  std::cout<<"CGPA:"<<s[i].cgpa<<'\n';
  }
}
