#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,i,x,c=0,t,p;
  std::cin>>n;
  i=n;
  x=n*n;
  while(n>0)
  {
    n=n/10;
    c+=1;
  }
  p=pow(10,c);
  t=int(x/p)+x%p;
  if(i==t)
    std::cout<<"Kaprekar Number";
  else
    std::cout<<"Not a Kaprekar Number";
}