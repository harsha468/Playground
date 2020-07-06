#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i=0,c=0;
  float s=0;
  while(c<3 and i>=0)
  {
    std::cin>>i;
    if(i%2!=0)
    {
      c+=1;
      s+=1;
    }
    else if(i%2==0 and i>=0)
    {
      s-=0.5;
    }
    else if(i<0)
    {
      s-=1;
    }
  }
  std::cout<<s;
}
