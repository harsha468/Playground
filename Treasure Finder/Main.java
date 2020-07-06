#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  d=a>b?((a>c)?a:c):b>c?b:c;
 
  if(d==a)
    e=b>c?b:c;
  else if(d==b)
    e=a>c?a:c;
  else if(d==c)
    e=a>b?a:b;
  std::cout<<"The treasure is in box which has number "<<e<<'\n';
  while(a!=b)
  {
    if(a>b)
      a=a-b;
    else
      b=b-a;
  }
  while(a!=c)
  {
    if(a>c)
      a=a-c;
    else
      c=c-a;
  }
  std::cout<<"The code to open the box is "<<c;
}
