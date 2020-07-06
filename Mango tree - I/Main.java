#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,p;
  std::cin>>m;
  std::cin>>n;
  std::cin>>p;
  if(p%n==0 or p%n==1 or (p>=1 and p<=5))
    std::cout<<"Yes";
  else
    std::cout<<"No";
}