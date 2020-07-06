#include <iostream>
using namespace std;
#include<string.h>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  cout<<"\nStudent Details";
  struct student s1;
  char n[50];
  cin.getline(n,50);
  int r;
  float m;
  cin>>r;
    cin>>m;
  strcpy(s1.name,n);
  s1.roll=r;
  s1.marks=m;
    cout<<"\nName: "<<s1.name<<"\nRoll: "<<s1.roll<<"\nMarks: "<<s1.marks;
  
}