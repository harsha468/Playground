#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  cin>>b;
  if(a>b)
    std::cout<<"Yes, you can enter.";
  else if(a==b)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}