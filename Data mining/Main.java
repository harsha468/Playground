#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,e=0,o=0,c,i=1,r;
  std::cin>>n;
  while(n>0)
  {
    if(i%2!=0)
    {
      o+=n%10;
      n=n/10;
      i+=1;
    }
    else
    {
      e+=n%10;
      n=n/10;
      i+=1;
    }
  }
  if(e==o)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}