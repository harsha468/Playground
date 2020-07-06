#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int N;
  float I;
  cin>>N;
  cin>>I;
  if(N<=3)
  {
    if(N==1)
      cout<<I<<"\n";
    else if(N==2) 
      cout<<I*1.5<<"\n";
    else
      cout<<I*2;
  } 
  else
    cout<<"Number of items is more";
}