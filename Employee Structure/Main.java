#include<iostream>
using namespace std;
struct employee
{
  char name[100];
  int id;
  int age;
  char desig[100];
  float salary;
};
int main()
{
  struct employee e;
  cout<<"Enter name:"<<"\n";
  cout<<"Enter ID:"<<"\n";
  cout<<"Enter age:"<<"\n";
  cout<<"Enter designation:"<<"\n";
  cout<<"Enter Salary:"<<"\n";
  cout<<"Employee Details"<<"\n";
  cin.getline(e.name,100);
  cout<<"Name of the Employee : "<<e.name<<"\n";
  cin>>e.id;
  cout<<"ID of the Employee : "<<e.id<<"\n";
  cin>>e.age;
  cout<<"Age of the Employee : "<<e.age<<"\n";
  cin>>e.desig;
  cout<<"Designation of the Employee : "<<e.desig<<"\n";
  cin>>e.salary;
  cout<<"Salary of the Employee : "<<e.salary<<"\n";
}