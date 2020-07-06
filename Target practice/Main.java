#include<iostream>
using namespace std;
int main()
{
  int n,s=0,i,c;
  std::cin>>n;
  while(s<n)
  {
    std::cin>>i;
    s+=i;
    c+=1;
  }
  std::cout<<"The number of turns is "<<c;
}