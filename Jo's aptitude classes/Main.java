#include<iostream>
using namespace std;
int main()
{
  int x,y,z,a;
  cin>>x;
  cin>>y;
  cin>>z;
  cin>>a;
  if(x%a==0 and y%a==0 and z%a==0)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}