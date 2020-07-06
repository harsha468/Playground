#include<iostream>
using namespace std;
int main()
{
  int N,t,sum=0;
  cin>>N;
  t=N;
  while(N!=0)
  {
    sum+=N%10;
    N/=10;
  }
  if(t%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}